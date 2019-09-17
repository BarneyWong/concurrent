package semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/17 21:43
 */
public class RepastService {
    volatile private Semaphore setSemaphore = new Semaphore(10);
    volatile private Semaphore getSemaphore = new Semaphore(20);
    volatile private ReentrantLock lock = new ReentrantLock();
    volatile private Condition setCondition = lock.newCondition();
    volatile private Condition getCondition = lock.newCondition();
    volatile private Object[] productPosition = new Object[4];
    volatile private int setCount = 0;
    volatile private int getCount = 0;

    private boolean isEmpty() {
        boolean isEmptpy = true;
        for (int i = 0; i < productPosition.length; i++) {
            if (productPosition[i] != null) {
                isEmptpy = false;
                break;
            }
        }
        return isEmptpy;
    }

    private boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < productPosition.length; i++) {
            if (productPosition[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void set() {
        try {
            setSemaphore.acquire();
            lock.lock();
            while (isFull()) {
                setCondition.await();
            }
            for (int i = 0; i < productPosition.length; i++) {
                if (productPosition[i] == null) {
                    System.out.println("生产完成 "+(setCount++));
                    Thread.sleep(1000);
                    productPosition[i] = "数据";
                    break;
                }
            }
            getCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            setSemaphore.release();
        }
    }

    public void get() {
        try {
            getSemaphore.acquire();
            lock.lock();
            while (isEmpty()) {
                getCondition.await();
            }
            for (int i = 0; i < productPosition.length; i++) {
                if (productPosition[i] != null) {
                    System.out.println("消费 "+(getCount++));
                    Thread.sleep(1000);
                    productPosition[i] = null;
                    break;
                }
            }
            setCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            getSemaphore.release();
        }
    }
}

package semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/16 21:05
 */
public class Service {
    /**
     * Semaphore ：信号系统，信号量主要作用是限制限制线程的并发数量。
     * Semaphore发放许可证的计算方式是“减法”操作；
     * new Semaphore（int permits）permits代表同时间内最多允许permits个线程同时执行 acquire（）和 release（）之间的代码。
     * 当 permits>1时，是无法保证线程安全性，
     */
    //设定初始化permits数
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        /**
         * semaphore.acquire( ) 获取单个permits
         * semaphore.acquire(int permits) 可以同时获取多个permits
         * semaphore.release( ) 释放单个permits
         * semaphore.release(int permits) 释放多个permits
         * 多次调用release（ ） 和 release（int permits）可以动态的增加permits的个数；
         * semaphore.acquireUninterruptibly() 使进入acquire（）方法的线程，不允许被打断。
         * semaphore.acquireUninterruptibly(int permits）
         * semaphore.availablePermits( )获取当前可用的permits数
         * semaphore.drainPermits( )获取并返回立即可用的所有许可个数，并将可用许可置0
         * semaphore.getQueueLength（ ）等待许可的线程个数
         * semaphore.hasQueuedThreads( )判断有没有线程在等待这个许可。
         * 这两个方法通常是在判断有没有等待许可的线程信息时使用。
         *
         * new Semaphore(int permits , boolean isFair) isFair 是否时公平锁
         * 获取许可的顺序与线程启动的顺序有关。
         * semaphore.tryAcquire( )
         * semaphore.tryAcquire( int permits )
         * semaphore.tryAcquire( long timeout,TimeUnit unit)
         * semaphore.tryAcquire( int permits ,long timeout, TimeUnit unit)
         * 尝试获取许可，得到则返回true，否则 false
         * 具有不阻塞的特点。
         */
//        try {

//            semaphore.acquire();
//            System.out.println(Thread.currentThread().getName() + " begin timer= " + System.currentTimeMillis());
//            Thread.sleep(5000);
//            System.out.println(Thread.currentThread().getName()+" end timer= "+System.currentTimeMillis());
//            semaphore.release();
            //获取permits数
//            int count = semaphore.availablePermits();
//            System.out.println(count);
//            semaphore.release(4);
//            count =semaphore.availablePermits();
//            System.out.println(count);
//            try {
//                semaphore.acquire();
//                System.out.println("Uninterruptibly");
//                semaphore.release();
//            }catch (InterruptedException e){
//                System.out.println("interrupted");
//                e.printStackTrace();
//            }

//            semaphore.acquire();
//            Thread.sleep(1000);
//            System.out.println(semaphore.getQueueLength());
//            System.out.println(semaphore.hasQueuedThreads());
//            semaphore.release();

//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
            if (semaphore.tryAcquire()) {
                System.out.println("get it !");
                semaphore.release();
            } else {
                System.out.println("Don't get it !");
            }
        }
    }

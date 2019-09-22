package phaser8;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 16:08
 */
public class ThreadA extends  Thread {
    private Phaser phaser;
    public ThreadA(Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run(){

        try {
            System.out.println(Thread.currentThread().getName()+"A1 begin "+System.currentTimeMillis());
//            phaser.awaitAdvanceInterruptibly(0);
//            phaser.awaitAdvanceInterruptibly(10);
            phaser.awaitAdvanceInterruptibly(0,5000, TimeUnit.MILLISECONDS);
            System.out.println(Thread.currentThread().getName()+"A1   end "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" enter into catch");
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }

}

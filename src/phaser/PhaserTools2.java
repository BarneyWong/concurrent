package phaser;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 10:39
 */
public class PhaserTools2 {
    /**
     * methodB只执行了一次arriveAndAwaitAdvance，
     */
    public static Phaser phaser;
    public static void methodA(){
        System.out.println(Thread.currentThread().getName()+" A1 begin = "+System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" A1   end = "+System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName()+" A2 begin = "+System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" A2   end = "+System.currentTimeMillis());
    }
    public static void methodB(){
        try {
            System.out.println(Thread.currentThread().getName()+" B1 begin = "+System.currentTimeMillis());
            Thread.sleep(5000);
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName()+" B1   end = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

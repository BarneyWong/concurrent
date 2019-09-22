package phaser6;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 15:57
 */
public class ThreadD extends  Thread {
    private Phaser phaser;
    public ThreadD(Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " D1 begin= " + System.currentTimeMillis());
            Thread.sleep(5000);

            phaser.arriveAndAwaitAdvance();

            System.out.println(Thread.currentThread().getName() + " D1   end= " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

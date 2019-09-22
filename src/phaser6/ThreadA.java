package phaser6;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 15:57
 */
public class ThreadA extends  Thread {
    private Phaser phaser;
    public ThreadA( Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " A1 begin= "+System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+ " A1   end= "+System.currentTimeMillis());
    }
}

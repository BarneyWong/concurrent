package phaser6;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 15:57
 */
public class ThreadB extends  Thread {
    private Phaser phaser;
    public ThreadB(Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " B1 begin= "+System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+ " B1  end= "+System.currentTimeMillis());
    }
}

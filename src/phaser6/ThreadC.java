package phaser6;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 15:57
 */
public class ThreadC extends  Thread {
    private Phaser phaser;
    public ThreadC(Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " C1 begin= " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(phaser.getPhase());
            System.out.println("Sleep time is over");
            phaser.awaitAdvance(0);
            System.out.println(phaser.getPhase());
            System.out.println(Thread.currentThread().getName() + " C1   end= " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

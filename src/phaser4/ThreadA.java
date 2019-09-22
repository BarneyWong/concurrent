package phaser4;


import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 12:00
 */
public class ThreadA extends Thread {
    private Phaser phaser;
    public ThreadA(Phaser phaser){
        super();
        this.phaser = phaser;
    }
    @Override
    public void run(){
        System.out.println(" A  begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println(" A    end phase value is "+phaser.getPhase());

        System.out.println(" B  begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println(" B    end phase value is "+phaser.getPhase());

        System.out.println(" C  begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println(" C    end phase value is "+phaser.getPhase());

        System.out.println(" D  begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println(" D    end phase value is "+phaser.getPhase());
    }
}

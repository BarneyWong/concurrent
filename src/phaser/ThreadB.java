package phaser;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 10:43
 */
public class ThreadB extends Thread {
    private Phaser phaser;
    public ThreadB(Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run() {
        PhaserTools.methodA();
    }
}

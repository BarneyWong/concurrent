package phaser3;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 10:43
 */
public class ThreadC extends Thread {
    private Phaser phaser;
    public ThreadC(Phaser phaser){
        this.phaser = phaser;
    }
    @Override
    public void run() {
        PhaserTools.methodB();
    }
}

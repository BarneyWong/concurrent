package phaser8;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 16:10
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA s = new ThreadA(phaser);
        s.start();
        try {
            Thread.sleep(3000);
            s.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Current thread is interrupted");
            e.printStackTrace();
        }
    }

}

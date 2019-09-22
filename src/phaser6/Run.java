package phaser6;

import semaphore.ThreadP;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 16:01
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        ThreadB b = new ThreadB(phaser);
        ThreadC c = new ThreadC(phaser);
        ThreadD d = new ThreadD(phaser);
        a.start();
        b.start();
        c.start();
        d.start();
    }

}

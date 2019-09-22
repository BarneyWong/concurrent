package phaser7;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 16:08
 */
public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "A1 begin " + System.currentTimeMillis());
        phaser.awaitAdvance(0);
        System.out.println(Thread.currentThread().getName() + "A1   end " + System.currentTimeMillis());

        System.out.println(Thread.currentThread().getName() + " enter into catch");
    }

}

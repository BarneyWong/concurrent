package phaser5;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 12:04
 */
public class MyService {
    private Phaser phaser;

    public MyService(Phaser phaser) {
        this.phaser = phaser;
    }

    public void testMethod() {
        try {
            System.out.println("A begin ThreadName is " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("B")) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("A   end ThreadName is " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());

            System.out.println("B begin ThreadName is " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("B")) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("B   end ThreadName is " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());

            System.out.println("C begin ThreadName is " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("B")) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("C   end ThreadName is " + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

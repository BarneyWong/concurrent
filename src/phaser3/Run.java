package phaser3;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 10:45
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PhaserTools.phaser = phaser;
        ThreadA threadA = new ThreadA(phaser);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(phaser);
        threadB.setName("B");
        threadB.start();
        ThreadC threadC = new ThreadC(phaser);
        threadC.setName("C");
        threadC.start();
    }
}

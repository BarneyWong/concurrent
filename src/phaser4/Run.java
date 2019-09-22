package phaser4;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 12:02
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
    }

}

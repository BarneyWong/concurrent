package phaser5;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 12:11
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2){
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println(" onAdvance is called");
//                return  true;
                return false;
            }
        };

        MyService service = new MyService(phaser);
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }

}

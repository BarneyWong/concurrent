package phaser5;

import java.util.concurrent.Phaser;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 12:09
 */
public class ThreadA extends  Thread {
    private MyService service ;
    public ThreadA(MyService service){
        this.service = service;
    }
    @Override
    public void run(){
        service.testMethod();
    }
}

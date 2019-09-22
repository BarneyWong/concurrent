package phaser5;

import phaser5.MyService;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 12:09
 */
public class ThreadB extends  Thread {
    private MyService service ;
    public ThreadB(MyService service){
        this.service = service;
    }
    @Override
    public void run(){
        service.testMethod();
    }
}

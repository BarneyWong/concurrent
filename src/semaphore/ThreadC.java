package semaphore;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/16 21:10
 */
public class ThreadC extends Thread {
    private RepastService service ;
    public ThreadC(RepastService service){
        this.service =service;
    }

    @Override
    public void run() {
        service.get();
    }
}

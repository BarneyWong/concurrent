package semaphore;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/16 21:09
 */
public class ThreadB extends  Thread {
    private Service service;
    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

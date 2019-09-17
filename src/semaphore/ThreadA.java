package semaphore;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/16 21:08
 */
public class ThreadA extends Thread {
    private Service service;
    public  ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

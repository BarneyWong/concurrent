package semaphore;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/17 21:57
 */
public class ThreadP extends Thread {
    private RepastService service;

    public ThreadP(RepastService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}

package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 16:55
 */
public class Run {
    public static void main(String[] args) {
        MyThreadFactory threadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
        for (int i = 0; i <100 ; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("The name of thread running is " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();

    }

}

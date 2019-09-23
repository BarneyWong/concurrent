package callable;

import semaphore.ThreadP;

import java.util.concurrent.Callable;

public class MyCallable2 implements Callable<String> {
    private int i = 0;

    @Override
    public String call() {
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "返回值";
    }
}

package callable;

import java.util.Calendar;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int age;
    public MyCallable(int age){
        this.age = age;
    }

    @Override
    public String call() throws InterruptedException {
        Thread.sleep(5000);
        return "返回值："+age;
    }
}

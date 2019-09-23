package callable;

import semaphore.ThreadP;

import java.sql.Time;
import java.util.concurrent.*;

public class Run {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//        MyCallable callable = new MyCallable(29);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,5000, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
//        Future<String> future = executor.submit(callable);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(future.get());
//        System.out.println(future.isDone());
//        System.out.println(System.currentTimeMillis());
//
//        UserInfo userInfo = new UserInfo();
//       Future<UserInfo> userInfoFuture =  executor.submit(new MyRunnable(userInfo),userInfo);
//        System.out.println(userInfoFuture.get());
        MyCallable2 callable2 = new MyCallable2();

        Future<String> future1 = executor.submit(callable2);
        Thread.sleep(2000);
        System.out.println(future1.get(5,TimeUnit.SECONDS));
    }
}

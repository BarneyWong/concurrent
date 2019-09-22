package executor3;

import semaphore.ThreadP;

import javax.swing.*;
import java.sql.Time;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 19:37
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " run!");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(7,9,5, TimeUnit.SECONDS,new SynchronousQueue<>());
        ThreadPoolExecutor executor =  new ThreadPoolExecutor(7,9,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        for (int i = 0; i <10 ; i++) {
            executor.execute(runnable);
        }
        System.out.println(executor.getCorePoolSize());
        System.out.println(executor.getPoolSize());
        System.out.println(executor.getQueue().size());
        Thread.sleep(10000);
        System.out.println(executor.getCorePoolSize());
        System.out.println(executor.getPoolSize());
        System.out.println(executor.getQueue().size());
    }

}

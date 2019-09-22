package executor2;

import java.util.concurrent.ThreadFactory;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/22 16:52
 */
public class MyThreadFactory implements ThreadFactory {
    private int i = 0;
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("BarneyWong-"+(i++));
        return thread;
    }
}

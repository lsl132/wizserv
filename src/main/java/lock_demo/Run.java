package lock_demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 本示例使用了ReentrantLock(显式锁)的基本使用
 */

public class Run {


    public static void main(String[] arge) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        LockTest test = new LockTest();
        for(int i=1;i<=5;i++) {
            executor.execute(new TestRunnable(test));
        }
        executor.shutdown();
    }



}

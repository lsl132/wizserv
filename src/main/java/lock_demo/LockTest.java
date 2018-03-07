package lock_demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    Lock lock = new ReentrantLock();
    ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(5);

    public void verifyLock() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"获取了锁...");
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+"释放了锁！");
        }

    }


}

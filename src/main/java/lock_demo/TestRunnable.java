package lock_demo;

public class TestRunnable implements Runnable {

    private LockTest test;

    public TestRunnable(LockTest test) {
        super();
        this.test = test;
    }

    public void run() {
        test.verifyLock();
    }
}

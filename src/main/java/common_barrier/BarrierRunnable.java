package common_barrier;

import java.util.concurrent.CyclicBarrier;

public class BarrierRunnable implements Runnable {

    private BarrierDeal bd;
    private CyclicBarrier cb;
    private int n;
    private final long FIXATION=5l;

    public BarrierRunnable(BarrierDeal bd, CyclicBarrier cb, int n) {
        this.bd = bd;
        this.cb = cb;
        this.n = n;
    }


    public void run() {
        Long start = (n-1)*FIXATION;
        Long end = n*FIXATION;
        bd.myThread(start,end,cb);
    }

}

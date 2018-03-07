package common_barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierDeal {

    public void  myThread(long start,long end,CyclicBarrier cb) {

        try {
            System.out.println(Thread.currentThread().getName()+"-->准备就绪 "+start+","+end);
            Thread.sleep(3000);
            //只有线程数量达到CyclicBarrier对象构造时定义的数量，所有线程才会开始并发执行，否则先到的线程只能等待。
            cb.await();
            for(long i=start;i<=end;i++) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }



    }


}

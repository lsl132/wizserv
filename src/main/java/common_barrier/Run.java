package common_barrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 本示例举例了CyclicBarrier(回环栅栏)的使用
 */
public class Run {

    public static void main(String[] arge) {
        try {
            BarrierDeal bd = new BarrierDeal();
            CyclicBarrier cb = new CyclicBarrier(10);
            ExecutorService executor = Executors.newFixedThreadPool(19);
            for(int i=1;i<=19;i++) {
                Thread.sleep(100);
                executor.execute(new BarrierRunnable(bd, cb, i));
            }
            executor.shutdown();

        } catch(Exception e) {
            System.out.println(e);
        }
    }



}

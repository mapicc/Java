package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.RunnableFuture;

/**
 * Created by zhaoguanjun on 2016/7/22.
 */
public class CyclicBarrierExample {

    public static void main(String[] args) {
        Runnable barrier1Action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Barrier1Action 开始执行");
            }
        };

        Runnable barrier2Action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Barrier2Action 开始执行");
            }
        };

        CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
        CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);
        CyclicBarrierRunnable barrierRunnable1 = new CyclicBarrierRunnable(barrier1, barrier2);
        CyclicBarrierRunnable barrierRunnable2 = new CyclicBarrierRunnable(barrier1, barrier2);
        new Thread(barrierRunnable1).start();
        new Thread(barrierRunnable2).start();
    }

}

class  CyclicBarrierRunnable implements Runnable {
    protected CyclicBarrier barrier1 = null;
    protected CyclicBarrier barrier2 = null;
    public CyclicBarrierRunnable(CyclicBarrier barrier1, CyclicBarrier barrier2) {
        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "等待barrier1");
            this.barrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "等待barrier2");
            this.barrier2.await();

            System.out.println(Thread.currentThread().getName() + "开始执行");
        } catch (InterruptedException e){
            e.printStackTrace();
        } catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}

package concurrent;

import java.util.concurrent.Semaphore;

/**
 * Created by zhaoguanjun on 2016/7/22.
 */
public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        //创建3个线程，通过信号量控制对count变量的操作
        SemaphoreRunnable semaphoreRunnable1 = new SemaphoreRunnable(semaphore);
        SemaphoreRunnable semaphoreRunnable2 = new SemaphoreRunnable(semaphore);
        SemaphoreRunnable semaphoreRunnable3 = new SemaphoreRunnable(semaphore);

        new Thread(semaphoreRunnable1).start();
        new Thread(semaphoreRunnable2).start();
        new Thread(semaphoreRunnable3).start();
    }
}

class SemaphoreRunnable implements Runnable {
    protected Semaphore semaphore = null;
    protected static long count;

    public SemaphoreRunnable(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("进入临界区");
            System.out.println(Thread.currentThread().getName() + "的count = " + count++);
            System.out.println(Thread.currentThread().getName() + "的count = " + count++);
            System.out.println(Thread.currentThread().getName() + "的count = " + count++);
            System.out.println(Thread.currentThread().getName() + "的count = " + count++);
            System.out.println("退出临界区");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

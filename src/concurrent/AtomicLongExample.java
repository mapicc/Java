package concurrent;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zhaoguanjun on 2016/7/22.
 */
public class AtomicLongExample {
    public static void main(String[] args) {
        AtomicLongRunnable atomicLongRunnable1 = new AtomicLongRunnable();
        LongRunnable longRunnable = new LongRunnable();

        //多次运行下面一组线程的结果都是正确的
        new Thread(atomicLongRunnable1).start();
        new Thread(atomicLongRunnable1).start();
        new Thread(atomicLongRunnable1).start();
        new Thread(atomicLongRunnable1).start();

        //多次运行下面一组线程的结果偶尔会出现错误
//        new Thread(longRunnable).start();
//        new Thread(longRunnable).start();
//        new Thread(longRunnable).start();
//        new Thread(longRunnable).start();
    }
}

class AtomicLongRunnable implements Runnable {
    private AtomicLong count = new AtomicLong(0);

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}

class LongRunnable implements Runnable {
    private long count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(++count);
        }
    }
}

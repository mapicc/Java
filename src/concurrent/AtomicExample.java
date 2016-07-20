package concurrent;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zhaoguanjun on 2016/7/20.
 */
public class AtomicExample implements Runnable {
    private static AtomicLong count = new AtomicLong(0);

    @Override
    public void run() {
        count.incrementAndGet();
        System.out.println(count);
    }

    public static void main(String[] args){
        AtomicExample t1 = new AtomicExample();
        AtomicExample t2 = new AtomicExample();
        AtomicExample t3 = new AtomicExample();
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}

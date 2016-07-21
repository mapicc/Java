package concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by zhaoguanjun on 2016/7/21.
 */
public class CountDownLatchExample {
    public static void main(String[] args){
        CountDownLatch latch = new CountDownLatch(3);
//        Waiter waiter = new Waiter(latch);
//        Decrementer decrementer = new Decrementer(latch);
        Waiter2 waiter2 = new Waiter2(latch);
        new Thread(waiter2).start();
        new Thread(waiter2).start();
        new Thread(waiter2).start();

//        new Thread(waiter).start();
//        new Thread(decrementer).start();
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

class Waiter2 implements Runnable {
    protected CountDownLatch latch = null;

    public Waiter2(CountDownLatch latch) {
        this.latch = latch;
        latch.countDown();
        System.out.println("count : " + latch.getCount());
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println(Thread.currentThread().getName() + "开始运行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Waiter implements Runnable {
    protected CountDownLatch latch = null;
    public Waiter(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "阻塞");
            latch.await();
            System.out.println(Thread.currentThread().getName() + "醒来");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Decrementer implements Runnable{
    protected CountDownLatch latch = null;
    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            latch.countDown();
            System.out.println(latch.getCount());
            Thread.sleep(1000);
            latch.countDown();
            System.out.println(latch.getCount());
            Thread.sleep(1000);
            latch.countDown();
            System.out.println(latch.getCount());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

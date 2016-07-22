package concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhaoguanjun on 2016/7/22.
 */
public class SemaphoreExample2 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        ReentrantLock lock = new ReentrantLock();
//        System.out.println(semaphore.getQueueLength());
//        semaphore.release();
//        System.out.println(semaphore.getQueueLength());
//        try {
//            System.out.println("即将阻塞" + semaphore.availablePermits());
//            semaphore.acquire();
//            System.out.println("阻塞" + semaphore.availablePermits());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        AtomicInteger count = new AtomicInteger(0);
        Producer2 producer2 = new Producer2(semaphore, lock, count);
        Consumer2 consumer2 = new Consumer2(semaphore, lock, count);

        new Thread(producer2).start();
        new Thread(producer2).start();
        new Thread(producer2).start();
        new Thread(consumer2).start();
        new Thread(consumer2).start();
        new Thread(consumer2).start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer2 implements Runnable {
    protected Semaphore semaphore = null;
    protected static AtomicInteger count = null;
    protected ReentrantLock lock = null;

    public Producer2(Semaphore semaphore, ReentrantLock lock, AtomicInteger count) {
        this.semaphore = semaphore;
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            semaphore.acquire();
            System.out.println(semaphore.availablePermits() + "Prodecer生产 : 有" + count.incrementAndGet() + "个产品");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class Consumer2 implements Runnable {
    protected Semaphore semaphore = null;
    protected static AtomicInteger count = null;
    protected ReentrantLock lock = null;

    public Consumer2(Semaphore semaphore, ReentrantLock lock, AtomicInteger count) {
        this.semaphore = semaphore;
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            semaphore.release();
            System.out.println(semaphore.availablePermits() + "Consumer消费 ：有" + count.decrementAndGet() + "个产品");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

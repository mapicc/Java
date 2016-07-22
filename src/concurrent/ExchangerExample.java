package concurrent;

import java.util.Objects;
import java.util.concurrent.Exchanger;

/**
 * Created by zhaoguanjun on 2016/7/22.
 */
public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();
        ExchangerRunnable exchangerRunnable1 = new ExchangerRunnable(exchanger, "A");
        ExchangerRunnable exchangerRunnable2 = new ExchangerRunnable(exchanger, "B");
        new Thread(exchangerRunnable1).start();
        new Thread(exchangerRunnable2).start();
    }
}

class ExchangerRunnable implements Runnable {
    Exchanger exchanger = null;
    Object object = null;
    public ExchangerRunnable(Exchanger exchanger, Object object) {
        this.exchanger = exchanger;
        this.object = object;
    }

    @Override
    public void run() {
        try {
            Object previous = this.object;
            this.object = this.exchanger.exchange(this.object);
            System.out.println(Thread.currentThread().getName() + "previous " + previous + "; now " + this.object);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

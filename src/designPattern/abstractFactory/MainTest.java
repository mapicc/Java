package designPattern.abstractFactory;

/**
 * Created by guanjun on 2016/7/24.
 */
public class MainTest {
    public static void main(String[] args) {
        Producer producer = new SmsSenderFactory();
        Sender sender = producer.produce();
        sender.send();
    }
}

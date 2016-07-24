package designPattern.abstractFactory;

/**
 * Created by guanjun on 2016/7/24.
 */
public class MailSenderFactory implements Producer {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

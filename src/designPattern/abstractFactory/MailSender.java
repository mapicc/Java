package designPattern.abstractFactory;

/**
 * Created by guanjun on 2016/7/24.
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}

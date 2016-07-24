package designPattern.factoryMethod;

/**
 * Created by guanjun on 2016/7/24.
 */
public class Apple implements Fruit{
    public void eat () {
        System.out.println("吃苹果");
    }

    @Override
    public void print() {
        System.out.println("我是苹果");
    }
}

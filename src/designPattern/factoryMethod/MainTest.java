package designPattern.factoryMethod;

/**
 * Created by guanjun on 2016/7/24.
 */
public class MainTest {
    public static void main(String[] args){
        String[] str = {"Apple", "Orange", "Other"};
        for (int i = 0; i < str.length; i++) {
            Fruit fruit = CommonFactoryMethod.FruitFactory(str[i]);
            if (fruit != null){
                fruit.eat();
                fruit.print();
            }
        }
    }
}

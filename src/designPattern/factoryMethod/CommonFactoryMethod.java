package designPattern.factoryMethod;

/**
 * Created by guanjun on 2016/7/24.
 */
public class CommonFactoryMethod {
    public static Fruit FruitFactory(String type) {
        if ("Apple".equals(type))
            return new Apple();
        else if ("Orange".equals(type))
            return new Orange();
        else{
            System.out.println("输入正确的类型");
            return null;
        }
    }
}

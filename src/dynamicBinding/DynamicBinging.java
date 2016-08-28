package dynamicBinding;

/**
 * Created by zhaoguanjun on 2016/8/28.
 */
public class DynamicBinging {
    public static void main(String[] args) {
        Father f = new Son();

        /**
         * 编译期间编译f, 所以f可以调用的方法都是Father的方法，执行期间绑定之Son方法
         */
        f.method();

        /**
         * 动态绑定只是对方法而言，对成员变量没有动态绑定
         */
        System.out.println(f.name);

        /**
         * 想要调用privateMethod只能是声明成Son
         */
        Son s = new Son();
        s.privateMethod();
        System.out.println(s.name);
    }
}

class Father {
    public String name = "F name";

    public void method() {
        System.out.println("Father.method");
    }
}

class Son extends Father {
    public String name = "S name";

    public void method() {
        System.out.println("Son.method");
    }

    public void privateMethod() {
        System.out.println("Son.privateMethod");
    }
}

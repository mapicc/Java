package nullTest;

/**
 * Created by zhaoguanjun on 2016/8/29.
 */
public class NullTest {
    public void method() {
        System.out.println("A Method!");
    }

    public static void main(String[] args) {
        NullTest t = null;
        /**
         * 不可以如下方式调用
         */
        //t.method();

        NullTest k = null;

        /**
         * 不可以如下方式调用
         */
//        if (t.equals(k))
//            System.out.println("equsls");

        /**
         * 可以这样调用，返回true
         */
        if (t == k)
            System.out.println("==");
    }
}

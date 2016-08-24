package string;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class StringIntern {
    public static void main(String[] args) {
        String string = new String("abc");
        string.intern();
        String s = "abc";
        System.out.println(s == string);
    }
}

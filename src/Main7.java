import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/8/14.
 */
public class Main7 {
    public static int indexOfCh(char ch) {
        return "0123456789ABCDEF".indexOf(ch);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext()) {
            str = scanner.next();
            String tmp = str.replaceFirst("0x", "");
            char[] chars = tmp.toCharArray();
            int ret = 0;
            for (int i = 0; i < chars.length; i++) {
                int num = indexOfCh(chars[i]);
                ret = ret * 16 + num;
            }
            System.out.println(ret);
        }
    }
}

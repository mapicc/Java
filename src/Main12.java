import java.util.*;

/**
 * Created by zhaoguanjun on 2016/9/12.
 */
public class Main12 {
    public static long helper(long n) {
        long num = 0;
        while (n != 0) {
            num = num * 10 + n % 10;
            n /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(helper(100));
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(helper(helper(x) + helper(y)));
        }
    }
}
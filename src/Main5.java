import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/8/14.
 */
public class Main5 {
    public static int helper(int n) {
        if (n < 2)
            return 0;
        if (n == 2)
            return 1;
        int count = n / 3;
        int mod = n % 3;
        return count + helper(count + mod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNextInt() && (n = scanner.nextInt()) != 0) {
            System.out.println(helper(n));
        }
    }
}

import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/9/18.
 */
public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int count = 0;
            for (int i = 5; i <= n; i++) {
                int tmp = i;
                while (tmp % 5 == 0) {
                    count++;
                    tmp /= 5;
                }
            }
            System.out.println(count);
        }
    }
}

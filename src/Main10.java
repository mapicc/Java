import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/9/4.
 */
public class Main10 {
    public static int indexOf(char c) {
        return "0123456789ABCDEF".indexOf(c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            int sum = 0;
            for (int i = 2; i < string.length(); i++) {
                sum = sum * 16 + indexOf(string.charAt(i));
            }
            System.out.println(sum);
        }
    }
}

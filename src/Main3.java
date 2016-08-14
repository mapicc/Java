import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/8/14.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            char[] chars = line.toCharArray();
            int[] a = new int[256];
            for (int i = 0; i < chars.length; i++) {
                if (a[chars[i]] == 0)
                    a[chars[i]] = 1;
            }
            for (int i = 0; i < chars.length; i++) {
                if (a[chars[i]]-- == 1)
                    System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}

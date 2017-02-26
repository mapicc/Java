import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/8/13.
 */
public class Huawei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine().trim();
            int ind = str.lastIndexOf(' ');
            System.out.println(str.length() - ind - 1);

        }
    }
}

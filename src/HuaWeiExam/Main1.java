package HuaWeiExam;

import java.util.Scanner;

/**
 * Created by guanjun on 2016/8/16.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().toLowerCase();
            int[] map = new int[256];
            for (int i = 0; i < line.length(); i++) {
                map[line.charAt(i)]++;
            }
            String c = scanner.nextLine();
            System.out.println(map[c.charAt(0)]);
        }
    }
}

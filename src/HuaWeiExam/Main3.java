package HuaWeiExam;

import java.util.Scanner;

/**
 * Created by guanjun on 2016/8/16.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] map = new int[1000];
            for (int i = 0; i < n; i++) {
                map[scanner.nextInt()]++;
            }
            for (int i = 0; i < 1000; i++) {
                if (map[i] != 0)
                    System.out.println(i);
            }
            System.out.println();
        }
    }
}

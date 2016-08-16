package HuaWeiExam;

import java.util.Scanner;

/**
 * Created by guanjun on 2016/8/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line.length() - line.lastIndexOf(" ") - 1);
        }
    }
}

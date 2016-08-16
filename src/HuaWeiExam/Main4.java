package HuaWeiExam;

import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * Created by guanjun on 2016/8/16.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.length() < 8) {
                int len = 8 - str.length();
                StringBuffer sb = new StringBuffer(str);
                for (int i = 0; i < len; i++) {
                    sb.append("0");
                }
                System.out.println(sb.toString());
            }else if (str.length() == 8) {
                System.out.println(str);
            }else {
                int index = (str.length() - 1) / 8 + 1;
                int i = 0;
                while (i < index - 1) {
                    System.out.println(str.substring(i * 8, (i + 1) * 8));
                    i++;
                }
                int mod = str.length() % 8;
                if (mod == 0) {
                    System.out.println(str.substring(i * 8, (i + 1) * 8));
                    continue;
                }
                int len = 8 - mod;
                StringBuffer sb = new StringBuffer(str.substring(i * 8, str.length()));
                for (int j = 0; j < len; j++) {
                    sb.append("0");
                }
                System.out.println(sb.toString());
            }
        }
    }
}

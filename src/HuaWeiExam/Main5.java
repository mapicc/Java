package HuaWeiExam;

import java.util.Scanner;

/**
 * Created by guanjun on 2016/8/16.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Node start = new Node(0, 0);
            String string = scanner.nextLine();
            String[] strs = string.split(";");
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(0) == 'A') {
                    try {
                        int a = Integer.valueOf(strs[i].substring(1, strs[i].length()));
                        start.x = start.x - a;
                    }catch (Exception e) {

                    }
                }else if (strs[i].charAt(0) == 'S') {
                    try {
                        int a = Integer.valueOf(strs[i].substring(1, strs[i].length()));
                        start.y = start.y - a;
                    }catch (Exception e) {

                    }
                }else if (strs[i].charAt(0) == 'D') {
                    try {
                        int a = Integer.valueOf(strs[i].substring(1, strs[i].length()));
                        start.x = start.x + a;
                    }catch (Exception e) {

                    }
                }else if (strs[i].charAt(0) == 'W') {
                    try {
                        int a = Integer.valueOf(strs[i].substring(1, strs[i].length()));
                        start.y = start.y + a;
                    }catch (Exception e) {

                    }
                }else {

                }
            }
            System.out.println(start.x + "," + start.y);
        }
    }
}

class Node {
    int x;
    int y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

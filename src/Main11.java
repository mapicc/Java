import java.util.*;

/**
 * Created by zhaoguanjun on 2016/9/5.
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            int i = 0, j = str.length() - 1;
            int len = 0;
            while (j > i) {
                while (j > i && str.charAt(i) == str.charAt(j)) {
                    i++;
                    j--;
                }
                if (j > i)
                    i = 0;
                while (j > i && str.charAt(i) != str.charAt(j)) {
                    j--;
                }

            }
            if (j == i){
                len = 2 * (i + 1) - 1;
            }else {
                len = 2 * (j + 1);
            }
            System.out.println(len);
        }
    }
}

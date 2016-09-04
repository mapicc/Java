import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/9/4.
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            try {
                int tmp = Integer.valueOf(string);
            }catch (Exception e) {

            }
            StringBuffer stringBuffer = new StringBuffer(string);
            System.out.println(stringBuffer.reverse());
        }
    }
}

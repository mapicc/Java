package HuaWeiExam;

/**
 * Created by guanjun on 2016/8/16.
 */
public class Main6 {
    public static int findNumberOf1(int num) {
        int count = 0;
        while(num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOf1(4));
    }
}

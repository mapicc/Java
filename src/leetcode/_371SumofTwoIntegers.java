package leetcode;

/**
 * Created by guanjun on 2016/8/16.
 */
public class _371SumofTwoIntegers {
    public static int getSum(int a, int b) {
        while ((a & b) != 0x00) {
            final int x = (a & b) << 1;
            final int y = (a ^ b);
            a = x;
            b = y;
        }
        return a | b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 3));
    }
}

package leetcode;

/**
 * Created by guanjun on 2016/8/22.
 */
public class _9PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int ret = 0;
        int c = x;
        while (c != 0) {
            ret = ret * 10 + c % 10;
            c = c / 10;
        }
        return ret == x;
    }
}

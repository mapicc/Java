package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/23.
 */
public class _125ValidPalindrome {
    public static boolean isPalindrome(String tmp) {
        String s = tmp.toLowerCase();
        if (s.length() == 0)
            return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char iChar = s.charAt(i);
            char jChar = s.charAt(j);
            if (Character.isLetterOrDigit(iChar) && Character.isLetterOrDigit(jChar)) {
                if (iChar != jChar)
                    return false;
                i++;
                j--;
            }else if (!Character.isLetterOrDigit(iChar)) {
                i++;
            }else {
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}

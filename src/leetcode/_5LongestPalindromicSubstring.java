package leetcode;

/**
 * Created by guanjun on 2016/8/16.
 */
public class _5LongestPalindromicSubstring {
    static int start, strlen;
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;
        for (int i = 0; i < len - 1; i++) {
            extendPalindromic(s, i, i);
            extendPalindromic(s, i, i + 1);
        }
        return s.substring(start, start + strlen);
    }

    private static void extendPalindromic(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (j - i - 1 > strlen) {
            start = i + 1;
            strlen = j - i - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcba"));
    }
}

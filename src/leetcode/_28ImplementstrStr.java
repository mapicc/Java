package leetcode;

/**
 * Created by guanjun on 2016/8/16.
 */
public class _28ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("", ""));
    }
}

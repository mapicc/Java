package leetcode;

/**
 * Created by guanjun on 2016/8/16.
 */
public class _14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < strs[0].length() && flag; i++) {
            int j;
            for (j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (j == strs.length)
                index++;
        }
        if (index == 0)
            return "";
        return strs[0].substring(0, index);
    }
}

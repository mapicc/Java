package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/13.
 */
public class _392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }else {
                j++;
            }
        }
        if(j <= t.length() && i == s.length())
            return true;
        else
            return false;
    }
}

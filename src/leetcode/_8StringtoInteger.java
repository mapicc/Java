package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/22.
 */
public class _8StringtoInteger {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0)
            return 0;
        double num = 0;
        boolean pos = true;
        boolean hasAdd = false;
        boolean hasMin = false;
        boolean procNum = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && !procNum && !hasMin && !hasAdd)
                continue;
            if(str.charAt(i) == '+' && !procNum && !hasMin && !hasAdd) {
                hasAdd = true;
                continue;
            }
            if(str.charAt(i) == '-' && !procNum && !hasAdd && !hasMin) {
                hasMin = true;
                pos = !pos;
                continue;
            }
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num = num * 10 + str.charAt(i) - '0';
                procNum = true;
            }
            else
                break;
        }
        if(pos)
            return num >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)num;
        else
            return (-num < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int)-num);
    }
}

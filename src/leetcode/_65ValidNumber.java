package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/26.
 */
public class _65ValidNumber {
    public boolean isNumber(String s) {
        if (s.trim().equals(".") || s.trim().length() == 0)
            return false;
        char[] chars = s.trim().toCharArray();
        boolean dot = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.' && dot == true)
                return false;
            else if (chars[i] == '.') {
                dot = true;
                if(i == chars.length - 1 && !Character.isDigit(chars[i - 1]))
                    return false;
            }else if (chars[i] == ' ') {
                return false;
            }else if (i == 0 && (chars[i] == '-' || chars[i] == '+')) {
                continue;
            }else if (Character.isLetterOrDigit(chars[i])) {
                if (Character.isDigit(chars[i]))
                    continue;
                if (Character.isLetter(chars[i])) {
                    if (chars[i] != 'e')
                        return false;
                    if (i == 0 || (chars[i - 1] != '.' && !Character.isDigit(chars[i - 1])))
                        return false;
                    if (i == 1 && chars[0] == '.')
                        return false;
                    try {
                        if (i == chars.length - 1)
                            return false;
                        if (chars[i + 1] == '+' || chars[i + 1] == '-') {
                            i++;
                        }
                        long val = Long.valueOf(s.trim().substring(i + 1));
                    }catch (Exception e) {
                        return false;
                    }
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _65ValidNumber t = new _65ValidNumber();
        System.out.println(t.isNumber("44e016912630333"));
    }
}

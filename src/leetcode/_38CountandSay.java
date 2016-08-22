package leetcode;


/**
 * Created by guanjun on 2016/8/21.
 */
public class _38CountandSay {
    public static String countAndSay(int n) {
        String ret = "" + 1;
        while (--n > 0) {
            ret = countAndSay2(ret);
        }
        return ret;
    }

    public static String countAndSay2(String nStr) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0, count = 0; i < nStr.length();) {
            while (i + count < nStr.length() && nStr.charAt(i) == nStr.charAt(i + count))
                count++;
            sb.append(count).append(nStr.charAt(i));
            i += count;
            count = 0;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}

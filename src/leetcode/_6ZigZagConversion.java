package leetcode;

/**
 * Created by guanjun on 2016/8/16.
 */
public class _6ZigZagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuffer[] stringBuffers = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuffers[i] = new StringBuffer();
        }
        int index = 0;
        boolean posi = true;
        for (int i = 0; i < s.length(); i++) {
            if (posi == true) {
                stringBuffers[index++].append(s.charAt(i));
                if (index == numRows - 1)
                    posi = false;
            }else {
                stringBuffers[index--].append(s.charAt(i));
                if (index == 0)
                    posi = true;
            }
        }
        for (int i = 1; i < numRows; i++) {
            stringBuffers[0].append(stringBuffers[i]);
        }
        return stringBuffers[0].toString();
    }

    public static void main(String[] args) {
        String s = convert("PAYPALISHIRING", 3);
        System.out.println(s);
    }
}

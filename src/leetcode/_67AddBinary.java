package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/22.
 */
public class _67AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("110010", "100"));
    }

    public static String addBinary(String a, String b) {
        if(a == null)
            return b;
        if(b == null)
            return a;
        int i = a.length() - 1, j = b.length() - 1, k = Math.max(i, j);
        int carry = 0;
        int[] sum = new int[k + 1];
        while(i >= 0 && j >= 0 && k >= 0) {
            if(a.charAt(i) == '1' && b.charAt(j) == '1') {
                sum[k--] = carry;
                carry = 1;
                i--;
                j--;
            }else if(a.charAt(i) == '0' && b.charAt(j) == '0') {
                sum[k--] = carry;
                carry = 0;
                i--;
                j--;
            }else {
                if(carry == 0) {
                    sum[k--] = 1;
                }else {
                    sum[k--] = 0;
                }
                i--;
                j--;
            }
        }
        StringBuffer sb = new StringBuffer();
        if(k >= 0) {
            while(i >=0) {
                if(carry == 1 && a.charAt(i) == '1') {
                    sum[k--] = 0;
                    i--;
                }
                else if(carry == 1 && a.charAt(i) == '0') {
                    carry = 0;
                    sum[k--] = 1;
                    i--;
                }else
                    sum[k--] = a.charAt(i--) - '0';
            }
            while(j >= 0) {
                if(carry == 1 && b.charAt(j) == '1') {
                    sum[k--] = 0;
                    j--;
                }
                else if(carry == 1 && b.charAt(j) == '0') {
                    carry = 0;
                    sum[k--] = 1;
                    j--;
                }else
                    sum[k--] = b.charAt(j--) - '0';
            }
        }
        if(carry == 1)
            sb.append(1);
        for(i = 0; i < sum.length; i++) {
            sb.append(sum[i]);
        }
        return sb.toString();
    }
}

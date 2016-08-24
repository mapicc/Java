package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class _260SingleNumber2 {
    public static int[] singleNumber(int[] nums) {
        int ret = nums[0];
        int[] res = new int[2];
        for (int i = 1; i < nums.length; i++) {
            ret = ret ^ nums[i];
        }
        int index = 1;
        while ((ret & index) == 0) {
            index <<= 1;
        }
        boolean[] first = new boolean[2];
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i] & index;
            if (tmp != 0) {
                if (first[0] == false) {
                    first[0] = true;
                    res[0] = nums[i];
                }else
                    res[0] = res[0] ^ nums[i];
            }else {
                if (first[1] == false) {
                    first[1] = true;
                    res[1] = nums[i];
                }else
                    res[1] = res[1] ^ nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        int[] a = singleNumber(nums);
        for (int i = 0; i < 2; i++) {
            System.out.print(a[i] + "   ");
        }
    }
}

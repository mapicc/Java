package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class _136SingleNumber {
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret = nums[i] ^ ret;
        }
        return ret;
    }
}

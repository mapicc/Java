package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class _136SingleNumber {
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            ret = nums[i] ^ nums[i + 1];
        }
        return ret;
    }
}

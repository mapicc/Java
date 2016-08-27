package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/27.
 */
public class _238ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        ret[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            ret[i] = ret[i - 1] * nums[i - 1];
        }
        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            ret[i] = ret[i] * right;
            right = right * nums[i];
        }
        return ret;
    }
}

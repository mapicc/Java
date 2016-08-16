package leetcode;

/**
 * Created by guanjun on 2016/8/16.
 */
public class _377CombinationSum4 {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(combinationSum4(num, 32));
    }

    public static int combinationSum4(int[] nums, int target) {
        if (target == 0)
            return 1;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i])
                ret += combinationSum4(nums, target - nums[i]);
        }
        return ret;
    }
}

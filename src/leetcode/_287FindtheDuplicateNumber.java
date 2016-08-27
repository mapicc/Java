package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/27.
 */
public class _287FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        if(nums.length < 3)
            return nums[0];
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int start = 0;
        while(start != slow) {
            start = nums[start];
            slow = nums[slow];
        }
        return start;
    }
}

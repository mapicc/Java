package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/28.
 */
public class _35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}

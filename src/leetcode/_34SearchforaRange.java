package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/23.
 */
public class _34SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        ret[0] = -1;
        ret[1] = -1;
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                int p = mid - 1;
                int q = mid + 1;
                while(p >= 0 && nums[p] == target) p--;
                while(q < nums.length && nums[q] == target) q++;
                ret[0] = p + 1;
                ret[1] = q - 1;
                break;
            }else if(nums[mid] < target) {
                left = mid + 1;
            }else
                right = mid - 1;
        }
        return ret;
    }
}

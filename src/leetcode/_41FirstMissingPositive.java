package leetcode;

/**
 * Created by guanjun on 2016/8/22.
 */
public class _41FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int[] map = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length && nums[i] > 0)
                map[nums[i]]++;
        }
        int i;
        for (i = 1; i < map.length; i++) {
            if (map[i] == 0)
                return i;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(firstMissingPositive(a));
    }
}

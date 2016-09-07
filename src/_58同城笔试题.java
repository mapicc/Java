import java.util.Arrays;

/**
 * Created by zhaoguanjun on 2016/9/2.
 */
public class _58同城笔试题 {
    public boolean check(int[] nums) {
        if (nums.length < 5)
            return false;
        Arrays.sort(nums);
        if (nums[0] != 0) {
            if (nums[nums.length - 1] - nums[0] == 4)
                return true;
        }else {
            int count = 0;
            if (nums[1] == 0) {
                count = nums[3] - nums[2] + nums[4] - nums[3] - 2;
                if (count <= 2)
                    return true;
            }else {
                count = nums[2] - nums[1] + nums[3] - nums[2] + nums[4] - nums[3] - 3;
                if (count <= 1)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        _58同城笔试题 t = new _58同城笔试题();
        int[] nums = {0, 0, 1, 4, 5};
        System.out.println(t.check(nums));
    }
}

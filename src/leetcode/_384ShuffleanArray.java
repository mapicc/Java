package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class _384ShuffleanArray {
    private int[] data;
    public _384ShuffleanArray(int[] nums) {
        this.data = nums;
    }

    public int[] reset() {
        return data;
    }

    public int[] shuffle() {
        int[] tmp = Arrays.copyOf(data, data.length);
        Random random = new Random();
        for (int i = tmp.length - 1; i >= 0; i--) {
            int rand = random.nextInt(tmp.length);
            swap(tmp, i, rand);
        }
        return tmp;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

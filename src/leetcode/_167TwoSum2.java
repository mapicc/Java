package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class _167TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int[] ret = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                ret[0] = i + 1;
                ret[1] = j + 1;
                break;
            }else if (numbers[i] + numbers[j] < target) {
                i++;
            }else {
                j--;
            }
        }
        return ret;
    }
}

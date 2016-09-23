package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/23.
 */
public class _47Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, list, l, new boolean[nums.length]);
        return list;
    }

    public void dfs(int[] nums, List<List<Integer>> list, List<Integer> l, boolean[] used) {
        if(l.size() == nums.length) {
            list.add(new ArrayList(l));
        }else {
            for(int i = 0; i < nums.length; i++) {
                if(used[i] == true || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                    continue;
                }
                l.add(nums[i]);
                used[i] = true;
                dfs(nums, list, l, used);
                used[i] = false;
                l.remove(l.size() - 1);
            }
        }
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/23.
 */
public class _90Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        list.add(new ArrayList(l));
        Arrays.sort(nums);
        dfs(nums, list, l, 0, new boolean[nums.length]);
        return list;
    }

    public void dfs(int[] nums, List<List<Integer>> list, List<Integer> l, int start, boolean[] used) {
        for(int i = start; i < nums.length; i++) {
            if(used[i] == true || (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false))
                continue;
            l.add(nums[i]);
            used[i] = true;
            if(!list.contains(l))
                list.add(new ArrayList(l));
            dfs(nums, list, l, i + 1, used);
            used[i] = false;
            l.remove(l.size() - 1);
        }
    }
}

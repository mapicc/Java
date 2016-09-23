package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/23.
 */
public class _78Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        list.add(new ArrayList(l));
        dfs(nums, list, l, 0);
        return list;
    }

    public void dfs(int[] nums, List<List<Integer>> list, List<Integer> l, int start) {
        for(int i = start; i < nums.length; i++) {
            if(!l.contains(nums[i])) {
                l.add(nums[i]);
                if(!list.contains(l)) {
                    list.add(new ArrayList(l));
                }
                dfs(nums, list, l, i + 1);
                l.remove(l.size() - 1);
            }
        }
    }
}

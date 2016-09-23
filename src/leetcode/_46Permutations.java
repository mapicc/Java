package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/23.
 */
public class _46Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        dfs(nums, list, l);
        return list;
    }

    public void dfs(int[] nums, List<List<Integer>> list, List<Integer> l) {
        if(l.size() == nums.length) {
            list.add(new ArrayList(l));
        }else {
            for(int i = 0; i < nums.length; i++) {
                if(l.contains(nums[i]))
                    continue;
                l.add(nums[i]);
                dfs(nums, list, l);
                l.remove(l.size() - 1);
            }
        }
    }
}

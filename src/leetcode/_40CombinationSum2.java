package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by guanjun on 2016/8/22.
 */
public class _40CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, list, cur, target, 0);
        return list;
    }

    private void helper(int[] candidates, List<List<Integer>> list, List<Integer> cur, int target, int start) {
        for (int i = start; i < candidates.length; i++) {
            if (target > candidates[i]) {
                cur.add(candidates[i]);
                helper(candidates, list, cur, target - candidates[i], i + 1);
                cur.remove(cur.size() - 1);
            }else if (target == candidates[i]) {
                cur.add(candidates[i]);
                int top = cur.get(cur.size() - 1);
                if (!list.contains(cur))
                    list.add(new ArrayList<>(cur));
                cur.remove((Object) top);
            }
        }
        return;
    }

    public static void main(String[] args) {
        _40CombinationSum2 t = new _40CombinationSum2();
        int[] a = {2,5,2,1,2};
        int[] b = {8,7,4,3};
        System.out.println(t.combinationSum2(a, 5));
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guanjun on 2016/8/22.
 */
public class _39CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        combination(candidates, list, cur, target, 0);
        return list;
    }

    private static void combination(int[] candidates, List<List<Integer>> list, List<Integer> cur, int target, int start) {
        for (int i = start; i < candidates.length; i++) {
            if (target > candidates[i]) {
                cur.add(candidates[i]);
                combination(candidates, list, cur, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }else if (target == candidates[i]){
                cur.add(candidates[i]);
                list.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] a = {8,7,4,3};
        System.out.println(combinationSum(a, 11));
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class _113PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        pathSumHelper(root, sum, l, list);
        return list;
    }

    public void pathSumHelper(TreeNode root, int sum, List<Integer> l, List<List<Integer>> list) {
        if(root == null)
            return;
        l.add(root.val);
        if(root.left == null && root.right == null && sum == root.val) {
            list.add(new ArrayList(l));
        }
        if(root.left != null) {
            pathSumHelper(root.left, sum - root.val, l, list);
        }
        if(root.right != null) {
            pathSumHelper(root.right, sum- root.val, l, list);
        }
        l.remove(l.size() - 1);
    }
}

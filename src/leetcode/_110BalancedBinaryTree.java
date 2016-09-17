package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class _110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        boolean[] ret = new boolean[1];
        ret[0] = true;
        height(root, 0, ret);
        return ret[0];
    }

    public int height(TreeNode root, int level, boolean[] ret) {
        if(root == null)
            return level;
        int l = height(root.left, level + 1, ret);
        if(!ret[0])
            return l;
        int r = height(root.right, level + 1, ret);
        if(!ret[0])
            return r;
        if(Math.abs(l - r) > 1)
            ret[0] = false;
        return Math.max(l, r);
    }
}

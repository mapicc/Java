package newCode;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class BalanceTree {
    public boolean isBalance(TreeNode head) {
        boolean[] ret = new boolean[1];
        ret[0] = true;
        getHeight(head, 0, ret);
        return ret[0];
    }

    private int getHeight(TreeNode head, int i, boolean[] ret) {
        if (head == null)
            return i;
        int l = getHeight(head.left, i + 1, ret);
        if (!ret[0])
            return l;
        int r = getHeight(head.right, i + 1, ret);
        if (!ret[0])
            return r;
        if (Math.abs(l - r) > 1)
            ret[0] = false;
        return Math.max(l, r);
    }
}

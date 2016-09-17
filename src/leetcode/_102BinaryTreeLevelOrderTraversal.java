package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class _102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        TreeNode last = root;
        TreeNode aLast = null;
        TreeNode tmp = null;
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            tmp = queue.poll();
            l.add(tmp.val);
            if(tmp.left != null){
                queue.offer(tmp.left);
                aLast = tmp.left;
            }
            if(tmp.right != null) {
                queue.offer(tmp.right);
                aLast = tmp.right;
            }
            if(tmp == last) {
                last = aLast;
                aLast = null;
                list.add(new ArrayList(l));
                l.clear();
            }
        }
        return list;
    }
}

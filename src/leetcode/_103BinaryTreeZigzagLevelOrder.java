package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/16.
 */
public class _103BinaryTreeZigzagLevelOrder {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return null;
        TreeNode last = root;
        TreeNode aLast = null;
        TreeNode tmp = null;
        boolean pos = true;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int level = 1;
        Deque<TreeNode> deq = new LinkedList<TreeNode>();
        deq.offerFirst(root);
        while(!deq.isEmpty()) {
            if(pos) {
                tmp = deq.pollFirst();
                l.add(tmp.val);
                if(tmp.left != null) {
                    deq.offerLast(tmp.left);
                    aLast = aLast == null ? tmp.left : aLast;
                }
                if(tmp.right != null) {
                    deq.offerLast(tmp.right);
                    aLast = aLast == null ? tmp.right : aLast;
                }
            }else {
                tmp = deq.pollLast();
                l.add(tmp.val);
                if(tmp.right != null) {
                    deq.offerFirst(tmp.right);
                    aLast = aLast == null ? tmp.right : aLast;
                }
                if(tmp.left != null) {
                    deq.offerFirst(tmp.left);
                    aLast = aLast == null ? tmp.left: aLast;
                }
            }
            if(tmp == last) {
                pos = !pos;
                last = aLast;
                aLast = null;
                list.add(new ArrayList<>(l));
                l.clear();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);


        System.out.println(zigzagLevelOrder(root));
    }
}

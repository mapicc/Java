package newCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by zhaoguanjun on 2016/9/16.
 */
public class PrintTreeByZigZag {
    public static void printTreeByZigZag(TreeNode head) {
        if (head == null)
            return;
        TreeNode nLast = null;
        TreeNode last = head;
        TreeNode tmp = null;
        boolean pos = true;
        int level = 1;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerFirst(head);
        System.out.print("level " + level++ + ":");
        while (!queue.isEmpty()) {
            if (pos) {
                tmp = queue.pollFirst();
                if (tmp.left != null) {
                    queue.offerLast(tmp.left);
                    nLast = nLast == null ? tmp.left : nLast;
                }
                if (tmp.right != null) {
                    queue.offerLast(tmp.right);
                    nLast = nLast == null ? tmp.right : nLast;
                }
            }else {
                tmp = queue.pollLast();
                if (tmp.right != null) {
                    queue.offerFirst(tmp.right);
                    nLast = nLast == null ? tmp.right : nLast;
                }
                if (tmp.left != null) {
                    queue.offerFirst(tmp.left);
                    nLast = nLast == null ? tmp.left : nLast;
                }
            }
            System.out.print(tmp.value + " ");
            if (tmp == last && !queue.isEmpty()) {
                pos = !pos;
                last = nLast;
                nLast = null;
                System.out.println();
                System.out.print("level " + level++ + ":");
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new newCode.TreeNode(2);
        root.left.left = new newCode.TreeNode(1);
        root.left.right = new newCode.TreeNode(3);
        root.right = new newCode.TreeNode(6);
        root.right.left = new newCode.TreeNode(5);
        root.right.right = new newCode.TreeNode(7);

        printTreeByZigZag(root);
    }
}

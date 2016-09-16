package newCode;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhaoguanjun on 2016/9/16.
 */
public class PrintTreeByLevel {
    public static void printTreeByLevel(TreeNode head) {
        if (head == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            System.out.print(tmp.value + " ");
            if (tmp.left != null)
                queue.offer(tmp.left);
            if (tmp.right != null)
                queue.offer(tmp.right);
        }
        System.out.println();
    }

    public static void printTreeByLevel2(TreeNode head) {
        if (head == null)
            return;
        TreeNode tmp = null;
        TreeNode last = head;
        TreeNode nLast = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(head);
        int level = 1;
        System.out.print("level " + level++ + ":");
        while (!queue.isEmpty()) {
            tmp = queue.poll();
            System.out.print(tmp.value + " ");
            if (tmp.left != null) {
                queue.offer(tmp.left);
                nLast = tmp.left;
            }
            if (tmp.right != null) {
                queue.offer(tmp.right);
                nLast = tmp.right;
            }
            if (tmp == last && !queue.isEmpty()) {
                System.out.println();
                System.out.print("level " + level++ + ":");
                last = nLast;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        newCode.TreeNode root = new newCode.TreeNode(4);
        root.left = new newCode.TreeNode(2);
        root.left.left = new newCode.TreeNode(1);
        root.left.right = new newCode.TreeNode(3);
        root.right = new newCode.TreeNode(6);
        root.right.left = new newCode.TreeNode(5);
        root.right.right = new newCode.TreeNode(7);

        //层序遍历二叉树
        printTreeByLevel(root);


        //带层编号的层序遍历
        printTreeByLevel2(root);
    }
}

package newCode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class IsBST {
    public static boolean isBST(TreeNode head) {
        if (head == null)
            return true;
        TreeNode pNode = head;
        TreeNode cur = null;
        List<Integer> list = new LinkedList<>();
        while (pNode != null) {
            cur = pNode.left;
            if (cur != null) {
                while (cur.right != null && cur.right != pNode) {
                    cur = cur.right;
                }
                if (cur.right == null) {
                    cur.right = pNode;
                    pNode = pNode.left;
                    continue;
                }else {
                    cur.right = null;
                }
            }
            list.add(pNode.value);
            pNode = pNode.right;
        }
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(isBST(root));
    }
}

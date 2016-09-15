package newCode;

/**
 * Created by guanjun on 2016/9/14.
 */
public class MorrisTree {
    public static void morrisIn(TreeNode root) {
        if (root == null)
            return;
        TreeNode pNode = root;
        TreeNode cur = null;
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
                }
                if (cur.right == pNode) {
                    cur.right = null;
                }
            }
            System.out.print(pNode.value + " ");
            pNode = pNode.right;
        }
    }

    public static void morrisPre(TreeNode root) {
        if (root == null)
            return;
        TreeNode pNode = root;
        TreeNode cur = null;
        while (pNode != null) {
            cur = pNode.left;
            if (cur != null) {
                while (cur.right != null && cur.right != pNode) {
                    cur = cur.right;
                }
                if (cur.right == null) {
                    cur.right = pNode;
                    System.out.print(pNode.value + " ");
                    pNode = pNode.left;
                    continue;
                }
                else {
                    cur.right = null;
                }
            }else
                System.out.print(pNode.value + " ");
            pNode = pNode.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        //中序遍历
        morrisIn(root);

        //先序遍历
        morrisPre(root);

    }
}

class TreeNode {
    public int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

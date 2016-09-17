package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class _94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode pNode = root;
        TreeNode cur = null;
        while(pNode != null) {
            cur = pNode.left;
            if(cur != null) {
                while(cur.right != null && cur.right != pNode) {
                    cur = cur.right;
                }
                if(cur.right == null) {
                    cur.right = pNode;
                    pNode = pNode.left;
                    continue;
                }else {
                    cur.right = null;
                    list.add(pNode.val);
                }
            }else
                list.add(pNode.val);
            pNode = pNode.right;
        }
        return list;
    }
}

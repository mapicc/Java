package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/23.
 */
public class _98ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        TreeNode pNode = root;
        TreeNode cur = null;
        List<Integer> list = new ArrayList<>();
        while(pNode != null) {
            cur = pNode.left;
            if(cur != null) {
                while(cur.right != null && cur.right != pNode)
                    cur = cur.right;
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
        boolean ret = true;
        for(int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) >= list.get(i + 1)) {
                ret = false;
                break;
            }
        }
        return ret;
    }
}

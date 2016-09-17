package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class _129SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        List<String> list = new ArrayList<>();
        String path = "";
        pathOfTree(root, path, list);
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += Integer.valueOf(list.get(i));
        }
        return sum;
    }

    public void pathOfTree(TreeNode root, String path, List<String> list) {
        if(root == null)
            return;
        path += root.val;
        if(root.left == null && root.right == null)
            list.add(path);
        if(root.left != null)
            pathOfTree(root.left, path, list);
        if(root.right != null)
            pathOfTree(root.right, path, list);
    }
}

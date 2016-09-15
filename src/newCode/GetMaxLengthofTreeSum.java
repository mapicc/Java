package newCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guanjun on 2016/9/15.
 */
public class GetMaxLengthofTreeSum {
    public static int getMaxLength(TreeNode root, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        return preOrder(root, 0, 1, 0, sum, map);
    }

    private static int preOrder(TreeNode root, int cur, int level, int max, int sum, Map<Integer, Integer> map) {
        if (root == null)
            return max;
        cur += root.value;
        if (map.containsKey(cur - sum))
            max = Math.max(max, level - map.get(cur - sum));
        if (!map.containsKey(cur))
            map.put(cur, level);
        max = preOrder(root.left, cur, level + 1, max, sum, map);
        max = preOrder(root.right, cur, level + 1, max, sum, map);

        //返回父节点时，将孩子节点记录删除
        if (level == map.get(cur))
            map.remove(cur);
        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println(getMaxLength(root, 3));
    }
}

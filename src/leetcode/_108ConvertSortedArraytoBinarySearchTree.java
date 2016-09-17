package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class _108ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        return generate(nums, 0, nums.length - 1);
    }

    public TreeNode generate(int[] nums, int left, int right) {
        if(left > right || left > nums.length - 1 || right < 0)
            return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = generate(nums, left, mid - 1);
        root.right = generate(nums, mid + 1, right);
        return root;
    }
}

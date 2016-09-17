package newCode;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class GenerateBST {
    public static TreeNode generateBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        return generate(nums, 0, nums.length - 1);
    }

    private static TreeNode generate(int[] nums, int begin, int end) {
        if (begin > end || begin >= nums.length || end < 0)
            return null;
        int mid = begin + (end - begin) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = generate(nums, begin, mid - 1);
        head.right = generate(nums, mid + 1, end);
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(generateBST(nums));
    }
}

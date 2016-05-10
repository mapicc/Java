package leetcode;

public class _112PathSum {
	
	public static boolean hasPathSum(TreeNode root,int sum){
		if(root == null)
			return false;
		if(root.left == null && root.right == null && root.val == sum)
			return true;
		boolean ret = false;
		if(root.left != null)
			ret = hasPathSum(root.left, sum - root.val);
		if(root.right != null)
			ret |=hasPathSum(root.right, sum - root.val);
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

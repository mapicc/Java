package leetcode;

public class _111MinimumDepthOfBinaryTree {
	
	public int minDepth(TreeNode root){
		if(root == null)
			return 0;
		int left = 1+minDepth(root.left);
		int right = 1+minDepth(root.right);
		if(root.left == null)
			return right;
		if(root.right == null)
			return left;
		return left>right?right:left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		this.val = x;
	}
}

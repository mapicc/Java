package leetcode;

public class _101SymmetricTree {
	public boolean isSymmetric(TreeNode root){
		return isMirror(root, root);
	}

	private boolean isMirror(TreeNode root, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root == null || root2 == null)
			return root == root2;
		return root.val == root2.val && isMirror(root.left, root2.right) && isMirror(root.right, root2.left);
	}
	
}

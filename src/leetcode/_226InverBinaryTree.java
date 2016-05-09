package leetcode;

public class _226InverBinaryTree {
	
	public static TreeNode invertTree(TreeNode root){
		if(root == null)
			return root;
		if(root.left != null && root.right != null){
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			invertTree(root.right);
			invertTree(root.left);
			return root;
		}
		if(root.left == null){
			root.left = root.right;
			invertTree(root.left);
			root.right = null;
			return root;
		}
		if(root.right == null){
			root.right = invertTree(root.left);
			root.left = null;
			return root;
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		invertTree(root);
		System.out.println(root.val + " " + root.left.val);
	}

}

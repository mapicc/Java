package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _257BinaryTreePaths {
	
	static List<String> list = new ArrayList<>();
	public static List<String> binaryTreePaths(TreeNode root){
		if(root == null)
			return list;
		childBinaryTreePaths(root,"");
		return list;
	}

	private static void childBinaryTreePaths(TreeNode root, String string) {
		// TODO Auto-generated method stub
		string +=root.val;
		if(root.left == null && root.right == null)
			list.add(string);
		if(root.left != null)
			childBinaryTreePaths(root.left, string + "->");
		if(root.right != null)
			childBinaryTreePaths(root.right, string + "->");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		System.out.println(binaryTreePaths(root));
	}

}

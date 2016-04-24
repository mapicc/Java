package preOrderOfTree;

import java.util.ArrayList;
import java.util.Stack;

import utilTree.*;

public class PreOrder {

	//递归先序遍历，结果存放alist
	public static void preOrder(TreeNode root,ArrayList<Integer> alist){
		if(root == null)
			return;
		alist.add(root.val);
		if(root.left != null)
			preOrder(root.left, alist);
		if(root.right != null)
			preOrder(root.right, alist);
	}
	
	//非递归先序遍历，结果存放alist
	public static void preOrder2(TreeNode root,ArrayList<Integer> alist){
		if(root == null)
			return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode t = stack.pop();
			alist.add(t.val);
			if(t.right != null)
				stack.add(t.right);
			if(t.left != null){
				stack.add(t.left);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Integer> alist2 = new ArrayList<Integer>();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right =new TreeNode(5);
		root.right.left = new TreeNode(6);
		preOrder(root, alist);
		System.out.println(alist);
		preOrder2(root, alist2);
		System.out.println(alist2);
	}

}

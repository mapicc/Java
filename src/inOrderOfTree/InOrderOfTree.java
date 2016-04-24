package inOrderOfTree;

import java.util.ArrayList;
import java.util.Stack;

import utilTree.*;

public class InOrderOfTree {
	
	//递归中序遍历，结果存放在alist
	public static void inOrder(TreeNode root,ArrayList<Integer> alist){
		if(root == null)
			return;
		if(root.left != null)
			inOrder(root.left, alist);
		alist.add(root.val);
		if(root.right != null)
			inOrder(root.right, alist);
	}

	//非递归中序遍历，结果存放在alist
	public static void inOrder2(TreeNode root,ArrayList<Integer> alist)
	{
		Stack<TreeNode> stack = new Stack<TreeNode>();
//		stack.add(root);
//		TreeNode p = root;
//		while(!stack.isEmpty()){
//			if(stack.peek().left != null)
//				stack.push(stack.peek().left);
//			else{
//				alist.add(stack.peek().val);
//				p = stack.pop();
//				if(p.right != null)
//					stack.push(p.right);
//			}
//		}
		TreeNode p = root;
		while(p != null || !stack.isEmpty()){
			if(p != null){
				stack.push(p);
				p = p.left;
			}else{
				p = stack.pop();
				alist.add(p.val);
				p = p.right;
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
		inOrder(root, alist);
		System.out.println(alist);
		inOrder2(root, alist2);
		System.out.println(alist2);
	}

}

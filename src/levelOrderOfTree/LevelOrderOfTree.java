package levelOrderOfTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import utilTree.TreeNode;

public class LevelOrderOfTree {

	public static void levelOrder(TreeNode root,ArrayList<Integer> alist){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root == null)
			return;
		TreeNode p = root;
		q.offer(p);
		while(!q.isEmpty()){
			p = q.peek();
			alist.add(p.val);
			q.poll();
			if(p.left != null)
				q.offer(p.left);
			if(p.right != null)
				q.offer(p.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right =new TreeNode(5);
		root.right.left = new TreeNode(6);
		levelOrder(root, alist);
		System.out.println(alist);
	}

}

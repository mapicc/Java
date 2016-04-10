package printTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	public static ArrayList<Integer> run(TreeNode root){
		if(root == null)
			return null;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeNode t = root;
		q.offer(t);
		while(!q.isEmpty()){
			list.add(q.poll().val);
			if(t.left != null)
				q.offer(t.left);
			
		}
		return list;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

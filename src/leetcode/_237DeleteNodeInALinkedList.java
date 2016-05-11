package leetcode;

public class _237DeleteNodeInALinkedList {
	public void deleteNode(ListNode node){
		if(node.next == null)
			return ;
		ListNode p = node.next;
		node.val = p.val;
		node.next = p.next;
	}
}

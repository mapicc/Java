package leetcode;

public class _19RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n){
		if(n <= 0 || head == null)
			return head;
		int index = 0;
		ListNode p = head;
		while(index < n && p != null){
			p = p.next;
			index ++;
		}
		if(p == null && index < n)
			return head;
		else if(p == null && index == n){
			return head.next;
		}
		ListNode q = head;
		while(p.next != null){
			q = q.next;
			p = p.next;
		}
		q.next = q.next.next;
		return head;
	}
}

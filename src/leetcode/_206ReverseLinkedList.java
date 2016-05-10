package leetcode;

public class _206ReverseLinkedList {
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode pre = null;
		ListNode p = head;
		ListNode next = p.next;
		while(next != null){
			p.next = pre;
			pre = p;
			p = next;
			next = next.next;
		}
		p.next = pre;
		return p;
	}
}

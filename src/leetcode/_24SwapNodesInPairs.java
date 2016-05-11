package leetcode;

public class _24SwapNodesInPairs {
	public ListNode swapPairs(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p = dummy;
		ListNode q = head;
		ListNode pre = head;
		while(q.next != null){
			p.next = q.next;
			ListNode tmp = null;
			if(p.next != null)
				tmp = p.next.next;
			p.next.next = pre;
			p = pre;
			q = tmp;
			pre = tmp;
		}
		return dummy.next;
	}
}

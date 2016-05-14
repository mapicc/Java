package leetcode;

public class _92ReverseLinkedList2 {
	public ListNode reverseBetween(ListNode head, int m, int n){
		if(head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p = dummy;
		ListNode pre = null;
		int i = 0;
		while(i < m && p != null){
			pre = p;
			p = p.next;
			i ++;
		}
		if(p == null)
			return head;
		ListNode start = p;
		ListNode q = p.next;
		while(i < n && q != null){
			if(i == m)
				p.next = null;
			ListNode tmp = q.next;
			q.next = p;
			p = q;
			q = tmp;
			i ++;
		}
		pre.next = p;
		start.next = q;
		return dummy.next;
	}
}

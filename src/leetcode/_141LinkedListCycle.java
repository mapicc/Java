package leetcode;

public class _141LinkedListCycle {
	public boolean hasCycle(ListNode head){
		if(head == null)
			return false;
		ListNode p = head, q = head;
		while(p != null && q != null){
			p = p.next;
			q = q.next;
			if(q == null)
				return false;
			else
				q = q.next;
			if(p == q)
				return true;
		}
		return false;
	}
}

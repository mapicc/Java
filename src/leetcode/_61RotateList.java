package leetcode;

public class _61RotateList {
	public ListNode rotateRight(ListNode head, int k){
		if(head == null || k <= 0)
			return head;
		ListNode p = head;
		ListNode q = head;
		int i = 0;
		int len = 1;
		while(p.next != null){
			p = p.next;
			len ++;
		}
		k = k % len;
		if(k == 0)
			return head;
		p = head;
		while(i < k && p != null){
			p = p.next;
			i ++;
		}
		if(p == null)
			return head;
		while(p.next != null){
			q = q.next;
			p = p.next;
		}
		ListNode ret = q.next;
		q.next = null;
		p.next = head;
		return ret;
	}
}

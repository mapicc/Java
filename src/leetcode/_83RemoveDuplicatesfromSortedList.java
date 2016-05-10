package leetcode;

public class _83RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode pre = head;
		ListNode p = head.next;
		while(p != null){
			while(p != null && pre.val == p.val){
				pre.next = p.next;
				p = p.next;
			}
			if(p != null){
				pre = p;
				p = p.next;
			}
		}
		return head;
	}
}

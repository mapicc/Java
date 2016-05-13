package leetcode;

public class _82RemoveDuplicatesFromSortedList2 {
	public ListNode deleteDuplicates(ListNode head){
		if(head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode start = head;
		ListNode end = head.next;
		while(end != null){
			while(end != null && start.val == end.val){
				end = end.next;
			}
			if(start.next == end && start.val != end.val){
				pre = pre.next;
				start = start.next;
				end = end.next;
				continue;
			}
			if(end != null){
				pre.next = end;
				start = end;
				end = end.next;
			}else
				pre.next = null;
		}
		return dummy.next;
	}
}

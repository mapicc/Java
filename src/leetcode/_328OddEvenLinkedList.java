package leetcode;

public class _328OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head){
		if(head == null || head.next == null || head.next.next == null)
			return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode pre = even;
		while(pre.next != null){
			odd.next = pre.next;
			odd = odd.next;
			pre.next = odd.next;
			if(pre.next != null)
				pre = pre.next;
		}
		odd.next = even;
		return head;
		
	}
}

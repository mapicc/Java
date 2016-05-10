package leetcode;

public class _203RemoveLinkedListElements {
	public static ListNode removeElements(ListNode head, int val){
		if(head == null)
			return head;
		ListNode p = head;
		while(p != null && p.val == val){
			p = p.next;
		}
		ListNode ret = p;
		ListNode pre = p;
		while(p != null){
			while(p != null && p.val != val){
				pre = p;
				p = p.next;
			}
			while(p != null && p.val == val){
				p = p.next;
			}
			if(pre == p)
				break;
			pre.next = p;
		}
		return ret;
	}
	
	public static void main(String args[]){
		ListNode head = new ListNode(2);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		ListNode p = removeElements(head, 2);
		System.out.println(p.val);
	}
}

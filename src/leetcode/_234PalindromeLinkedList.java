package leetcode;

public class _234PalindromeLinkedList {
	public static boolean isPalindrome(ListNode head){
		if(head == null || head.next == null)
			return true;
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null && fast.next == null)
			slow = slow.next;
		slow = reverse(slow);
		fast = head;
		boolean ret = false;
		while(slow != null){
			if(fast.val != slow.val){
				ret = false;
				break;
			}else
				ret = true;
			slow = slow.next;
			fast = fast.next;
		}
		return ret;
	}
	
	public static ListNode reverse(ListNode head){
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
	
	public static void main(String[] args){
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(2);
		list.next.next.next = new ListNode(1);
		System.out.println(isPalindrome(list));
	}
}

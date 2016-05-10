package leetcode;

public class _160IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
		if(headA == null || headB == null)
			return null;
		ListNode p = headA;
		ListNode q = headB;
		int lenA = 0, lenB = 0;
		while(p != null){
			p = p.next;
			lenA ++;
		}
		while(q != null){
			q = q.next;
			lenB ++;
		}
		p = headA;
		q = headB;
		if(lenA <= lenB){
			int diff = lenB - lenA;
			while(diff -- > 0)
				q = q.next;
			while(lenA > 0){
				p = p.next;
				q = q.next;
				if(p == q)
					return p;
				lenA --;
			}
		}else{
			int diff = lenA - lenB;
			while(diff > 0){
				p = p.next;
				diff --;
			}
			while(lenB > 0){
				p = p.next;
				q = q.next;
				if(p == q)
					return p;
				lenB --;
			}
		}
		return null;
	}
}

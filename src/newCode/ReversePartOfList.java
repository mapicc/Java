package newCode;

public class ReversePartOfList {
	public Node reversePart(Node head, int from, int to){
		if(head == null || head.next == null || from >= to)
			return head;
		Node dummy = new Node(0);
		dummy.next = head;
		Node p = dummy;
		Node pre = null;
		int i = 0;
		while(i < from && p != null){
			pre = p;
			p = p.next;
			i++;
		}
		Node start = p;
		//from大于链表的长度
		if(p == null)
			return head;
		Node q = p.next;
		while(i < to && q != null){
			if(i == from)
				p.next = null;
			Node next = q.next;
			q.next = p;
			p = q;
			q = next;
			i++;
		}
		Node end = p;
		pre.next = end;
		start.next = q;
		return dummy.next;
	}
}

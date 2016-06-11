package newCode;

public class RemoveMidNode {
	public static Node removeMidNode(Node head){
		if(head == null)
			return head;
		Node p = head;
		int len = 0;
		while(p != null){
			p = p.next;
			len++;
		}
		int mid = len / 2;
		if(mid == 0)
			return head.next;
		int index = 0;
		p = head;
		Node pre = null;
		while(index++ < mid){
			pre = p;
			p = p.next;
		}
		pre.next = p.next;
		return head;
	}
	
	//节点数增加2个，要删除的中间结点后移一个
	public static Node removeMidNode2(Node head){
		if(head == null || head.next == null)
			return head;
		if(head.next.next == null)
			return head.next;
		Node cur = head;
		Node p = head.next.next;
		while(p.next != null && p.next.next != null){
			cur = cur.next;
			p = p.next.next;
		}
		cur.next = cur.next.next;
		return head;
	}
	
	public static Node removeByRatio(Node head, int a, int b){
		if(a < 1 || a > b)
			return head;
		int len = 0;
		Node cur = head;
		while(cur !=  null){
			len++;
			cur = cur.next;
		}
		len = (int) Math.ceil(((double) (a * len)) /(double) b );
		if(len == 1)
			head = head.next;
		if(len > 1){
			cur = head;
			while(--len != 1)
				cur = cur.next;
			cur.next = cur.next.next;
		}
		return head;
	}
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		Node ret = removeMidNode(head);
		System.out.println(" " + ret.value + " " + ret.next.value);
	}
}

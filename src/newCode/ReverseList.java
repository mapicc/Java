package newCode;

public class ReverseList {
	
	public static Node reverseList(Node head){
		if(head == null || head.next == null)
			return head;
		Node pre = null, p = head, q = head.next;
		while(q != null){
			p.next = pre;
			pre = p;
			p = q;
			q = q.next;
		}
		p.next = pre;
		return p;
	}
	
	public static DoubleNode reverseList(DoubleNode head){
		DoubleNode pre = null;
		DoubleNode next = null;
		while(head != null){
			next = head.next;
			head.next = pre;
			head.last = next;
			pre = head;
			head = next;
		}
		return pre;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		Node ret = reverseList(head);
		System.out.println(" " + ret.value + " " + ret.next.value + " " + ret.next.next.value);
	}

}

class DoubleNode {
	public int value;
	public DoubleNode last;
	public DoubleNode next;
	public DoubleNode(int data){
		this.value = data;
	}
}

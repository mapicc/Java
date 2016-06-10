package newCode;

public class RemoveLastKthNode {
	
	/**
	 * ɾ���������е�����K���ڵ�
	 */
	public Node removeLastKthNode(Node head, int k){
		if(head == null || k < 1)
			return head;
		Node p = head;
		while(p != null){
			p = p.next;
			k--;
		}
		if(k > 0)
			return head;
		else if(k == 0){
			return head.next;
		}else{
			Node q = head;
			while(++k != 0){
				q = q.next;
			}
			q.next = q.next.next;
			return head;
		}
	}
}

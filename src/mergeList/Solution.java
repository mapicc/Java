package mergeList;

public class Solution {
	
	//�ҵ���@val��ĵ�һ���ڵ��ǰ���ڵ㣬û���򷵻����һ���ڵ�
    public static ListNode Find(ListNode list,int val){
        ListNode p = list;
        while(p.next != null && p.next.val < val){
            p = p.next;
        }
        //System.out.println(val+"�ڽڵ�"+p.val+"����");
        return p;
    }
    
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode p = list2;
        while(p != null){
            ListNode tmp = new ListNode(p.val);
            ListNode q = Find(list1,tmp.val);
            //System.out.println(tmp.val+"����"+q.val+"֮��");
            tmp.next = q.next;
            q.next = tmp;
            p = p.next;
        }
        return list1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1=new ListNode(1);
		list1.next=new ListNode(3);
		list1.next.next=new ListNode(5);
		ListNode list2=new ListNode(2);
		list2.next=new ListNode(4);
		list2.next.next=new ListNode(6);
		System.out.println("list1 before: "+list1.val+" "+list1.next.val+" "+list1.next.next.val);
		System.out.println("list2 before: "+list2.val+" "+list2.next.val+" "+list2.next.next.val);
		ListNode p=Merge(list1, list2);
		System.out.println("list1 after: "+p.val+" "+p.next.val+" "+p.next.next.val+" "+p.next.next.next.val);
	}

}

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val = val;
	}
}

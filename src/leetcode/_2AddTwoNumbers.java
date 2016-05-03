package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _2AddTwoNumbers {
	
	//消耗很大
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		Queue<Integer> s1 = new LinkedList<>();
		Queue<Integer> s2 = new LinkedList<>();
		ListNode p = l1;
		ListNode q = l2;
		while(p != null){
			s1.offer(p.val);
			p = p.next;
		}
		while(q != null){
			s2.offer(q.val);
			q = q.next;
		}
		int tmp = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode ret = null;
		while(!s1.isEmpty() && !s2.isEmpty()){
			int add = s1.poll() + s2.poll()+tmp;
			if(add >= 10){
				add -= 10;
				tmp = 1;
			}else
				tmp = 0;
			list.add(add);
		}
		while(!s1.isEmpty()){
			int add = s1.poll()+tmp;
			if(add >= 10){
				add -= 10;
				tmp =1;
			}else
				tmp = 0;
			list.add(add);
		}
		while(!s2.isEmpty()){
			int add = s2.poll()+tmp;
			if(add>=10){
				add -= 10;
				tmp = 1;
			}else
				tmp = 0;
			list.add(add);
		}
		if(tmp == 1)
			list.add(1);
		System.out.print(list);
		ret = new ListNode(list.get(0));
		ListNode t = ret;
		for(int i = 1;i<list.size();i++){
			ListNode s = new ListNode(list.get(i));
			t.next = s;
			t = t.next;
		}
		return ret;
	}
	
	//消耗稍微减少了些。但还是不够快
	public static ListNode addTwoNumbers_2(ListNode l1,ListNode l2){
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		ListNode s = l1;
		ListNode t = l2;
		int tmp = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(s != null && t != null){
			int add = s.val + t.val + tmp;
			if(add >= 10){
				add -= 10;
				tmp = 1;
			}else
				tmp = 0;
			s = s.next;
			t = t.next;
			list.add(add);
		}
		while(s != null){
			int add = s.val + tmp;
			if(add >= 10){
				add -= 10;
				tmp = 1;
			}else
				tmp = 0;
			s = s.next;
			list.add(add);
		}
		while(t != null){
			int add = t.val + tmp;
			if(add >= 10){
				add -= 10;
				tmp = 1;
			}else
				tmp = 0;
			t = t.next;
			list.add(add);
		}
		if(tmp == 1)
			list.add(1);
		ListNode ret = new ListNode(list.get(0));
		ListNode a = ret;
		for(int i=1;i<list.size();i++){
			ListNode b = new ListNode(list.get(i));
			a.next = b;
			a = a.next;
		}
		return ret;
	}
	
	//最简洁的代码
	public static ListNode addTwoNumbers_3(ListNode l1, ListNode l2) {
	    int carry = 0;
	    ListNode p, dummy = new ListNode(0);
	    p = dummy;
	    while (l1 != null || l2 != null || carry != 0) {
	        if (l1 != null) {
	            carry += l1.val;
	            l1 = l1.next;
	        }
	        if (l2 != null) {
	            carry += l2.val;
	            l2 = l2.next;
	        }
	        p.next = new ListNode(carry%10);
	        carry /= 10;
	        p = p.next;
	    }
	    return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		ListNode l2 = new ListNode(0);
		l1 = addTwoNumbers_3(l1, l2);
		System.out.print(""+l1.val +" "+ l1.next.val);
	}

}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

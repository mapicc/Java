package linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list2.add(11);
		list2.add(12);
//		list.addAll(list);
//		Object[] a = list.toArray();
//		list2 = (LinkedList<Integer>) list.clone();
//		Arrays.sort(a);
		list.sort(null);
//		int i = Arrays.binarySearch(a, 3);
		System.out.println(list);
//		for(i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		
	}

}

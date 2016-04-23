package binarySearch;

public class BinarySearch {
	
	public static int binarySearch(int a[],int val){
		if(a == null)
			return -1;
		int i = 0;
		int j = a.length-1;
		while(i<=j){
			int mid = (i+j)/2;
			if(a[mid] == val)
				return mid;
			else if(a[mid]>val)
				j = mid-1;
			else
				i = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(a, 4));
	}

}

package quickSort;

public class QuickSort {

	public void Sort(int a[],int left,int right){
		if(left > right)
			return;
		int key = a[left];//2,1,5,9,6,3,8,7,4,0 left = 0,right = 9
		int i = left;
		int j = right;
		while(i<j){
			while(a[j]>key && i<j){
				j--;
			}
			a[i] = a[j];
			while(a[i]<key && i<j){
				i++;
			}
			a[j] = a[i];
		}
		a[i] = key;
		//return i;
		Sort(a,left,i-1);
		Sort(a,i+1,right);
	}
	
//	public void Sort2(int a[],int left,int right){
//		if(left<right){
//			int q = Sort(a,left,right);
//			Sort2(a,left,q-1);
//			Sort2(a,q+1,right);
//		}
//		
//	}

	public static void main(String []args){
		QuickSort qs = new QuickSort();
		int a[] = {2,1,5,9,6,3,8,7,4,0};
		qs.Sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
	}
}

package insertSort;

public class InsertSortTest {
	public void InsertSort(int a[]){
		if(a.length<=0)
			return;
		for(int i=1;i<a.length;i++){
			if(a[i]<a[i-1]){
				int j=i-1;
				int key=a[i];
				while(j>=0 && key<a[j]){
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=key;
			}
		}
	}
	
	public void print(int a[]){
		if(a.length<=0)
			return;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={5,6,2,1,8,9,3,5,4};
		InsertSortTest is=new InsertSortTest();
		is.InsertSort(a);
		is.print(a);
	}

}

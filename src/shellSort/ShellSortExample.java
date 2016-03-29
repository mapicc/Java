/**
 * 一个希尔排序的例子
 * 
 */
package shellSort;

/**
 * @author mapic
 *
 */
public class ShellSortExample {

	/**
	 * @param args
	 * 
	 */
	public void shellInsertSort(int a[],int dk){
		for(int i=dk;i<a.length;i++){
			if(a[i]<a[i-dk]){
				int j=i-dk;
				int key=a[i];
				//a[i]=a[i-dk];
				while(j>=0 && key<a[j]){
					a[j+dk]=a[j];
					j=j-dk;
				}
				a[j+dk]=key;
			}
		}
	}
	
	public void shellSort(int a[]){
		int dk=a.length;
		while(dk>=1){
			shellInsertSort(a, dk);
			dk=dk/2;
		}
	}
	
	public void print(int a[]){
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,4,6,2,8,3,1,9,10,25,47,7};
		ShellSortExample ss=new ShellSortExample();
		ss.shellSort(a);
		ss.print(a);
	}

}

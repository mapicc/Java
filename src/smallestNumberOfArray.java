import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class smallestNumberOfArray {
	
	public int Solution(int a[]){
		if(a == null)
			return -1;
		int i = 0;
		int j = a.length-1;
		while(i != j-1){
			int mid = (i+j)/2;
			if(a[mid]>a[i])
				i = mid;
			else
				j = mid;
		}
		return a[j];
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a[] = {3,4,5,1,2};
		Class<?> s = Class.forName("smallestNumberOfArray");
		Object t = s.newInstance();
		Method m = s.getMethod("Solution", int[].class);
		int ret = (int) m.invoke(t, a);
		System.out.println(ret);
	}

}

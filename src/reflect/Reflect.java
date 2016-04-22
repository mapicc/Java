package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
	public int Solution(int a[]){
		return 1;
	}
	
	private void Test(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,4,5,1,2};
		Class<?> s = null;
		try{
			s = Class.forName("smallestNumberOfArray");
		}catch(Exception e){
			e.printStackTrace();
		}
		Object t = null;
		try {
			t = s.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method m;
		Object ret = null;
		try {
			System.out.println(s.getDeclaredMethods()[2]);
			m = s.getMethod("Solution", new Class[]{int.class});
			try {
				ret = m.invoke(t, a);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println((int)ret);
	}
}

package leetcode;
/**
 * @author zhaoguanjun
 *
 */

public class _326PowerofThree {
	
	//ʹ�õݹ飬�ܵݹ��������
	public static boolean isPowerofThree(int n){
		if(n == 1)
			return true;
		if(n % 3 == 0 && isPowerofThree(n / 3))
			return true;
		return false;
	}
	
	//ʹ��ѭ��
	public static boolean isPowerofThree2(int n) {
		if(n <= 0)
			return false;
		while(n != 1){
			if(n % 3 != 0)  
				return false;
			n = n / 3;
		}
		return true;
	}
	
	//������㷨���������в���ڶ��ֿ�
	public static boolean isPowerofThree3(int n) {
		return (n > 0) && (Math.pow(3, 19) % n == 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package leetcode;

public class _70ClimbingStairs {
	//递归，这种方法不好
	public int climbStairs(int n) {
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		return climbStairs(n - 1) + climbStairs(n - 2);
	}
	
	public int climbStairs2(int n) {
		if(n == 1)
			return 1;
		int n1 = 0;
		int n2 = 1;
		for(int i = 0; i < n; i++){
			int tmp = n2;
			n2 += n1;
			n1 = tmp;
		}
		return n2;
	}
}

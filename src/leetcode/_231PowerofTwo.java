package leetcode;

public class _231PowerofTwo {
	public boolean isPowerofTwo(int n){
		return n > 0 && (n & (n - 1)) == 0;
	}
}

package leetcode;

public class _191Numerof1Bits {
	
	public static int hammingWeight(int n){
		int count = 0;
		while(n != 0){
			n = n & (n - 1);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

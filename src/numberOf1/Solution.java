package numberOf1;

public class Solution {
	public static int run(int n){
		int count = 0;
		while(n != 0){
			count++;
			n = (n-1) & n;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(run(9));
	}

}

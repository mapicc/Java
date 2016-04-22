package leetcode;

public class AddDigits {
	
	public static int Solution(int num){
		if(num < 0)
			return -1;
		if(num < 10)
			return num;
		int n = 1;
		int sum = 0;
		while(num/Math.pow(10, n) != 0){
			sum+=num%Math.pow(10, n);
			num/=Math.pow(10, n++);
		}
		return Solution(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution(38));
	}

}

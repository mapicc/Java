package newCode;

/**
 * @author 77321
 */

public class NumSum {
	
	public static int numSum(String s){
		if(s == null)
			return 0;
		int sum = 0;
		int num = 0;
		boolean pos = true;
		int cur = 0;
		for(int i = 0; i < s.length(); i++){
			cur = s.charAt(i) - '0';
			if(cur >= 0 && cur <= 9){
				num = num * 10 + (pos ? cur: -cur);
			}else{
				sum += num;
				num = 0;
				if(s.charAt(i) == '-')
					pos = !pos;
				else
					pos = true;
			}
		}
		sum += num;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numSum("----5"));
	}

}

package leetcode;

public class _66PlusOne {
	public int[] plusOne(int[] digits) {
		int carry = 1;
		for(int i = digits.length - 1; i >=0; i--){
			digits[i] += carry;
			if(digits[i] > 9){
				carry = 1;
				digits[i] -= 10;
			}else{
				carry = 0;
			}
		}
		if(carry == 0)
			return digits;
		else{
			int[] ret = new int[digits.length + 1];
			ret[0] = 1;
			for(int i = 1; i < digits.length; i++){
				ret[i] = digits[i - 1];
			}
			return ret;
		}
		
	}
}

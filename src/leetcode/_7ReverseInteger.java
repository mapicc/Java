package leetcode;

import java.util.ArrayList;

public class _7ReverseInteger {
	
	public static int reverse(int x){
		int tmp = Math.abs(x);
		int index = 1;
		ArrayList<Integer> list = new ArrayList<>();
		while(tmp/10 != 0){
			index ++;
			list.add(tmp % 10);
			tmp = tmp / 10;
		}
		list.add(tmp % 10);
		int i = 0;
		tmp = 0;
		while(i < index){
			tmp = (int) (list.get(i) * Math.pow(10, index - i - 1) + tmp); 
			i++;
		}
		if(tmp >= Integer.MAX_VALUE)
			return 0;
		if(x < 0)
			return -tmp;
		else
			return tmp;
	}
	
	public static int reverse_2(int x){
		long ret = 0;
		while(x != 0){
			ret = ret * 10 + x % 10;
			if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE)
				return 0;
			x /= 10;
		}
		return (int) ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1534236469;
		System.out.print(reverse(x));
	}

}

package leetcode;

public class _338CountingBits {
	
	public static int[] countBits(int num) {
		if(num < 0)
			return null;
		int[] ret = new int[num + 1];
		for(int i = 0; i <= num; i++){
			int index = i;
			while(index != 0){
				ret[i]++;
				index = index & (index - 1);
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ret = countBits(5);
		for(int i = 0; i <= 5; i++){
			System.out.print(ret[i] + " ");
		}
	}

}

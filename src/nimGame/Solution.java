package nimGame;

public class Solution {
	
	public static boolean run(int n){
		if(n == 1 || n == 2 || n == 3)
			return true;
		if(!run(n-1) || !run(n-2) || !run(n-3))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<15;i++){
			System.out.println(run(i));
		}
	}

}

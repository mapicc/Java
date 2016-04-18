package staticClassAccessControl;

public class Solution {
	public static int a = 0;
	int b = 0;
	public void Test(){
		class InnerClass{
			public void run(){
				a = 4;
				b = 5;
			}
		}
	}

	class InnerClass{
		public int run(){
			a = 5;
			return a;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		InnerClass i = s.new InnerClass();
		s.Test();
		System.out.println(i.run());
	}

}

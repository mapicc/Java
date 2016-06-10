package leetcode;

public class _58LengthofLastWord {
	
	public static int lengthOfLastWord(String s){
		s = s.trim();
		int len = s.length();
		int lastSpace = s.lastIndexOf(' ');
		return len - lastSpace - 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}

}

package leetcode;

public class ReverseString {
	public static String reverseString(String s){
		if(s != null){
			char c[] = s.toCharArray();
			StringBuffer sb = new StringBuffer();
			int len = c.length;
			for(int i=0;i<len/2;i++){
				char tmp = c[i];
				c[i] = c[len-i-1];
				c[len-i-1] = tmp;
			}
			for(int i=0;i<len;i++){
				sb.append(c[i]);
			}
			return sb.toString();
		}
		return s;
	}
	
	public static String reverse(String s){
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(reverseString(s));
		System.out.println(reverse(s));
	}

}

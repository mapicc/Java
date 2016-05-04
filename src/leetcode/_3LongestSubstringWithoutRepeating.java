package leetcode;

public class _3LongestSubstringWithoutRepeating {
	
	public static int lengthOfLongestSubstring(String s){
		if(s == null || s.length() == 0)
			return 0;
		int map[] = new int[256];
		int start = 0,end = 0;
		int window = Integer.MIN_VALUE;
		while(end < s.length()){
			if(map[s.charAt(end)] != 0){
				
				map[s.charAt(start++)]--;
			}else{
				map[s.charAt(end++)]++;
				if(end - start > window)
					window = end - start;
			}
		}
		return window;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwk";
		System.out.print(lengthOfLongestSubstring(s));
	}

}

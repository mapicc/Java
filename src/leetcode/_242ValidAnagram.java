package leetcode;

public class _242ValidAnagram {
	public boolean isAnagram(String s, String t){
		if(s == null && t == null)
			return true;
		if(s == null || t == null || s.length() != t.length())
			return false;
		int[] map = new int[256];
		for(int i = 0; i < s.length(); i++){
			map[s.charAt(i)]++;
		}
		for(int i = 0; i < t.length(); i++){
			map[t.charAt(i)]--;
			if(map[t.charAt(i)] < 0)
				return false;
		}
		return true;
	}
}

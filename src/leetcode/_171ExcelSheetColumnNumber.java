package leetcode;

public class _171ExcelSheetColumnNumber {
	public int titleToNumber(String s){
		int sum = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) < 'A' || s.charAt(i) > 'Z')
				return 0;
			sum = sum * 26 + s.charAt(i) - 'A' + 1;
		}
		return sum;
	}
}

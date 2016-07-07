package leetcode;

public class _345ReverseVowelsofaString {

	public static String reverseVowels(String s) {
		//zhaoguanjun@172.28.50.35
		if(s == null)
			return s;
		int i = 0, j = s.length() - 1;
		char[] ch = s.toCharArray();
		while(i < j){
			char ci = ch[i];
			char cj = ch[j];
			if(ci == 'a' || ci == 'e' || ci == 'i' || ci == 'o' || ci == 'u' || ci == 'A' || ci == 'E' || ci == 'I' || ci == 'O' || ci == 'U'){
				if(cj == 'a' || cj == 'e' || cj == 'i' || cj == 'o' || cj == 'u' || cj == 'A' || cj == 'E' || cj == 'I' || cj == 'O' || cj == 'U'){
					ch[i] = cj;
					ch[j] = ci;
					j--;
					i++;
				}else
				    j--;
			}else{   
			    i++;
			}
		} 
		return new String(ch);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("aA"));
	}

}

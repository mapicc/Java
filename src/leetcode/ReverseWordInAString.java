package leetcode;

public class ReverseWordInAString {
	
	public static String reverseWords(String s){
		if(s == null)
			return null;
		char[] c = s.toCharArray();
		int len = c.length;
		if(len == 0)
			return "";
		int count = 0;
		int j = 0;
		while(c[j++] == ' ');
		j--;
		for(int i=j;i<len;i++){
			if(i+1<len && c[i]==' ' && c[i+1] != ' ')
				count++;
		}
		StringBuffer[] sb = new StringBuffer[count+1];
		for(int i=0;i<sb.length;i++){
			sb[i] = new StringBuffer();
		}
		int index = sb.length;
		for(int i=j;i<len;i++){
			if(c[i] != ' '){
				sb[index-1].append(c[i]);
			}else if(i+1<len && c[i+1] != ' '){
				index--;
			}else
				continue;
		}
		StringBuffer ret = new StringBuffer();
		for(int i=0;i<sb.length;i++){
			ret.append(sb[i].toString());
			if(i != sb.length-1)
				ret.append(" ");
		}
		return ret.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  the sky     is blue";
		System.out.println(reverseWords(s));
	}

}

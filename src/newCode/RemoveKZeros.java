package newCode;

public class RemoveKZeros {
	
	public static String removeKZeros(String str, int k) {
		if(str == null || k < 1)
			return str;
		char[] c = str.toCharArray();
		int start = -1;
		int count = 0;
		for(int i = 0; i < c.length; i++){
			if(c[i] == '0'){
				count++;
				if(start == -1)
					start = i;
			}else{
				if(count == k){
					while(count-- != 0){
						c[start++] = 0;
					}
				}
				count = 0;
				start = -1;
			}
		}
		if(count == k)
			while(count-- != 0)
				c[start++] = 0;
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeKZeros("A0000B000", 4));
	}

}

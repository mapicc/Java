package newCode;

import java.io.ObjectInputStream.GetField;

public class Rotation {
	public static boolean isRotation(String a, String b){
		if(a == null || b == null || a.length() != b.length())
			return false;
		String check = b + b;
		if(check.contains(a))
			return true;
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(isRotation("2ab1", "ab12"));
	}
}

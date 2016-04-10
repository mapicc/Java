package printMinNumber;

public class Solution {

	public static String PrintMinNumber(int [] numbers) {
        if(numbers.length == 1)
            return numbers[0]+"";
        if(numbers.length == 2){
           	String n1 = ""+numbers[0] + numbers[1];
            String n2 = ""+numbers[1] + numbers[0];
            if(Integer.parseInt(n1)<Integer.parseInt(n2))
                return n1;
            else
                return n2;
        }else{
            String n1 = ""+numbers[0] + numbers[1];
            String n2 = ""+numbers[1] + numbers[0];
            int a1 = Integer.parseInt(n1);
            int a2 = Integer.parseInt(n2);
            if(a1<a2){
                int a[] = new int[numbers.length-1];
                a[0] = a1;
                for(int i=1;i<a.length;i++){
                    a[i] = numbers[i+1];
                }
                return PrintMinNumber(a);
            }else{
                int a[] = new int[numbers.length-1];
                a[0] = a2;
                for(int i=1;i<a.length;i++){
                    a[i] = numbers[i+1];
                }
                return PrintMinNumber(a);
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,32,321};
		System.out.println(PrintMinNumber(a));
	}

}

package reversePolishNotation;

import java.util.Stack;

public class Solution {

	public static int run(String []tokens){
		Stack<String> s=new Stack<String>();
		Stack<Integer> t=new Stack<Integer>();
		int ret=0;
		for(int i=tokens.length-1;i>=0;i--){
			s.push(tokens[i]);
		}
		int n1,n2;
		while(!s.isEmpty()){
			if(s.peek().matches("-?[0-9]+")){
				t.push(Integer.parseInt(s.pop()));
			}else if(s.peek().equals("+")){
				n1=t.pop();
				n2=t.pop();
				t.push(n1+n2);
				s.pop();
			}else if(s.peek().equals("-")){
				n1=t.pop();
				n2=t.pop();
				t.push(n2-n1);
				s.pop();
			}else if(s.peek().equals("*")){
				n1=t.pop();
				n2=t.pop();
				t.push(n2*n1);
				s.pop();
			}else{
				n1=t.pop();
				n2=t.pop();
				t.push(n2/n1);
				s.pop();
			}
		}
		ret=t.pop();
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []tokens={"-4","13","5","/","+"};
		System.out.println(run(tokens));
	}

}

package newCode;

import java.util.Stack;

public class ReverseStack {
	public int getLastandRemoveElement(Stack<Integer> stack){
		int ret = stack.pop();
		if(stack.isEmpty())
			return ret;
		else{
			int last = getLastandRemoveElement(stack);
			stack.push(ret);
			return last;
		}
	}
	
	public void reverse(Stack<Integer> stack){
		if(stack.isEmpty())
			return ;
		else{
			int last = getLastandRemoveElement(stack);
			reverse(stack);
			stack.push(last);
		}
	}
	
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		ReverseStack rs = new ReverseStack();
		rs.reverse(stack);
		System.out.println(stack);
	}
}

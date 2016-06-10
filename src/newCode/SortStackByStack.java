package newCode;

import java.util.Stack;

public class SortStackByStack {
	public void sortStackByStack(Stack<Integer> stack){
		Stack<Integer> help = new Stack<>();
		while(!stack.isEmpty()){
			int peek = stack.pop();
			while(!help.isEmpty() && help.peek() < peek){
				stack.push(help.pop());
			}
			help.push(peek);
		}
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
	}
}

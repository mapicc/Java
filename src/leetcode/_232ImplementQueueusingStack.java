package leetcode;

import java.util.Stack;

public class _232ImplementQueueusingStack {
	private Stack<Integer> spush = new Stack<>();
	private Stack<Integer> spop = new Stack<>();
			
	public void push(int x){
		spush.push(x);
	}
	
	public void pop(){
		while(!spush.isEmpty()){
			spop.push(spush.pop());
		}
		spop.pop();
		while(!spop.isEmpty()){
			spush.push(spop.pop());
		}
	}
	
	public int peek(){
		while(!spush.isEmpty()){
			spop.push(spush.pop());
		}
		int ret = spop.peek();
		while(!spop.isEmpty()){
			spush.push(spop.pop());
		}
		return ret;
	}
	
	public boolean empty(){
		return spush.isEmpty();
	}
}

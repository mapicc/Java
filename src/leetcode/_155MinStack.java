package leetcode;

import java.util.Stack;

public class _155MinStack {
	private Stack<Integer> s = new Stack<>();
	private Stack<Integer> min = new Stack<>();
	
	public _155MinStack() {
		// TODO Auto-generated constructor stub
	}
	
	public void push(int x){
		s.push(x);
		if(min.isEmpty() || x <= min.peek())
			min.push(x);
	}
	
	public void pop(){
		if(s.peek().equals(min.peek())){
			s.pop();
			min.pop();
		}else
			s.pop();
	}
	
	public int top(){
		return s.peek();
	}
	
	public int getMin(){
		return min.peek();
	}
	
	public static void main(String[] args){
		_155MinStack s = new _155MinStack();
		s.push(512);
		s.push(-1024);
		s.push(-1024);
		s.push(512);
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.getMin());
	}
}

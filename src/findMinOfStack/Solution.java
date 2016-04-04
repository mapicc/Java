package findMinOfStack;

import java.util.Stack;

public class Solution {

	Stack<Integer> s=new Stack<Integer>();
    
    public void push(int node) {
        s.push(node);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int min() {
        int a[]=new int[s.size()];
        for(int i=0;i<a.length;i++){
            a[i]=s.pop();
        }
        int ret=a[0];
        for(int i=1;i<a.length;i++){
            if(ret>a[i])
                ret=a[i];
        }
        for(int i=a.length-1;i>=0;i--){
            s.push(a[i]);
        }
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		s.push(3);
		s.push(4);
		s.min();
		s.push(2);
		System.out.println(s.min());
	}

}

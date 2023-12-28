package collections;

import java.util.Stack;

public class Stack_ex {
public static void main(String[] args) {
	Stack<Integer> s1=new Stack<Integer>();
	s1.push(2);
    s1.push(5);
    s1.push(1);
    s1.push(9);
    s1.push(4);
   
    Object o1=s1.pop();
    while(o1!=null) {
    	System.out.println(o1);
    	if(!s1.isEmpty()) {
    		o1=s1.pop();
    	}
    	else
    	{
    		break;
    	}
    }
    System.out.println("-------------------------");
    Stack<Integer> s2=new Stack<Integer>();
    s2.push(2);
    s2.push(5);
    s2.push(1);
    s2.push(9);
    s2.push(4);
    for(int i=s2.size()-1;i>=0;i--) {
    	System.out.println(s2.pop());
    }
}
}

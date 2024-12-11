package com.ksg.collection;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        System.out.println(stack);
        
        System.out.println(stack.pop());
        
        System.out.println(stack);
        
        System.out.println(stack.peek());
        
        System.out.println(stack);
        
        System.out.println(stack.empty());
        
        System.out.println(stack.search("C"));

	}

}

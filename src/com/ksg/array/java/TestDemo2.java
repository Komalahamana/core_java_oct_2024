package com.ksg.array.java;

public class TestDemo2 {
	
	 public static void main(String[] args) {
	        
	        
	        TestDemo2 test = new TestDemo2();
	        
	        test.add(10,20);
	        
	        test.add(100, 200);
	        
	        test.add(5, 20);
	        
	        String str = test.wish("Hi good morning all!!!");
	        
	        System.out.println(str);
	    }
	    
	    
	    public void add(int a, int b) {
	        
	        
	        int sum = a+b;
	        
	        System.out.println("The sum of a and b is : "+sum);
	        
	        
	    }
	    
	    public String wish(String message) {
	        
	        System.out.println(message);
	        
	        return "Hello";
	        
	    }

	

}

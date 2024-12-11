package com.ksg.array.java;

public class Test1 {
	
public static void main(String[] args) {
        
        
        Test1 test = new Test1();
        
        test.add(10,20);
        
        test.add(100, 200);
    }
    
    public void add(int a, int b) {
        
        int sum = a+b;
        
        System.out.println("The sum of a and b is : "+sum);
        
    }
    
}
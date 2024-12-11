package com.ksg.practice;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Calculation.add(10,20);
        
        Calculation.add(10,20,30);
        
        Calculation.add(10,20,30,40);
        

    }
    
    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    
    public static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    
    public static void add(int a ,int b, int c ,int d) {
        System.out.println(a+b+c+d);
    

	}

}

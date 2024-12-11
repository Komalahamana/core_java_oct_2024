package com.ksg.array.java;

public class Demo1 {
	
	public void m1(){
		System.out.println("m1 method with zero argument");
	}
	
	public void m1(int a) {
		
		System.out.println(a);	
	}
	
	public void m1(int a,int b) {
		
		System.out.println(a+" "+b);
	}
	public void m1(int a,int b,int c) {
		
		System.out.println(a+" "+b+" "+c);
	}
	public void m1 (int a,int b,int c,int d) {
		
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		
		demo.m1();
        
        demo.m1(10);
        
        demo.m1(10,20);
        
        demo.m1(10,20,30);
        
        demo.m1(10,20,30,40);
		
		
	}
}

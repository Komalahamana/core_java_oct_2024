package com.ksg.array.java;

public class Demo2 {
	
	public void m1(int...a) {
		
		System.out.println("var arg method");
	}
	public static void main(String[] args) {
		
		Demo2 demo = new Demo2();
		
		demo.m1(10);
		demo.m1(10,20);
		demo.m1(10,20,30);
		demo.m1(10,20,30,40);
		
		
		
	}
		
}

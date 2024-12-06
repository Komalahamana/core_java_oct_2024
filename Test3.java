package com.ksg.oops;

public class Test3 {
	
	public void m1() {
		System.out.println("no argument method");
	}
	public void m1(int i) {
		System.out.println("one argument method");
	}
	public void m1(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.m1("ram");
		t1.m1(100);
		t1.m1();
		
		
	}
		
	}


package com.ksg.array.java;

public class TestDemo {
	
	int x = 10;
	static int y =20;

	public static void main(String[] args) {
		Test t1 = new Test();
		
		t1.x=888;
		t1.y=999;
		
		Test t2 = new Test();
		
		 System.out.println( t1.x+" "+t1.y);
		
		System.out.println(t2.x+"   "+t2.y);
		
		
	}
}

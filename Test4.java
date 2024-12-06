package com.ksg.oops;

public class Test4 {
	
	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer method");
		
	}
     public void m1 (String s) {
    	 System.out.println("String s");
     }
     public static void main(String[] args) {
		
    	 Test t1 = new Test();
    	 t1.m1("StringBuffer method");
    	 t1.m1("String s");
    	 
	}
}

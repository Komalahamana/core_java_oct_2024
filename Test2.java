package com.ksg.oops;

public class Test2 {
	
	public void m1(StringBuffer sb) {
        System.out.println("StringBuffer method");
    }
    public void m1(String s) {
        System.out.println("String Version");
    }
    public static void main(String[] args) {
        
        Test2 testDemo = new Test2();
        
        testDemo.m1("durga");
        testDemo.m1(new StringBuffer("durga"));
        //testDemo.m1(null);
    }


}

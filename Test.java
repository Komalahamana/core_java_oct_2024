package com.ksg.oops;

public class Test {
	
	 public void m1() {
	        System.out.println("No argument m1 method");
	    }
	    
	    
	    public void m1(int i) {
	        System.out.println("One argument m1 method");
	    }
	    
	    public void m1(String name) {
	        System.out.println(name);
	    }
	    
	    public static void main(String[] args) {
	        
	        Test t1 = new Test();
	        
	        t1.m1("Avinash");  
	        
	        t1.m1();
	        
	        t1.m1(100);
	        
	        
	        
	    }


}

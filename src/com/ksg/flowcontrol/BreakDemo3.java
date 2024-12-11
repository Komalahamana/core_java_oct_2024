package com.ksg.flowcontrol;

public class BreakDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int a = 10;
	        
	        level1:
	        {
	            System.out.println("Hello");
	            
	            if(a==10)
	                break level1;
	            System.out.println("Hi");
	        }
	        System.out.println("End");

	}

}

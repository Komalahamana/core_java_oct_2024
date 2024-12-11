package com.ksg.flowcontrol;

public class FindGreaterNoFromThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a = 5;
	        
	        int b = 7;
	        
	        int c = 3;
	        
	        if(a>b) {
	            if(a>c) {
	                System.out.println("A is a greater number");
	            }else {
	                System.out.println("C is a greater number");
	            }
	        }else {
	            if(b>c) {
	                System.out.println("B is a greater number");
	            }else {
	                System.out.println("C is a greater number");
	            }
	        }

	}

}

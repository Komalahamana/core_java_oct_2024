package com.ksg.flowcontrol;

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] a = { 10, 20, 30, 40, 50 };
	        
	        System.out.println("Iterate array elements using normal for loop: ");

	        for (int i = 0; i < a.length; i++) {
	            
	            System.out.println(a[i]);
	            
	        }
	        
	        System.out.println("Iterate array elements using enhance for loop: ");
	        
	        for(int i : a ) {
	            System.out.println(i);
	        }
	        
	        


	}

}

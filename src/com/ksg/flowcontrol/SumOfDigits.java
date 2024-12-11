package com.ksg.flowcontrol;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int number = 32165467;
	        
	        int rem = 0;
	        
	        int sum = 0;
	        
	        while(number>0) {     
	            rem = number%10;   
	            sum=sum+rem;       
	            number = number/10;    
	        }
	        System.out.println(sum);


	}

}

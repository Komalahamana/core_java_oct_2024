package com.ksg.flowcontrol;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int i = 0; i < 3; i++) {
	            
	            for (int j = 0; j < 3; j++) {
	                if (i == j)
	                    break;
	                System.out.println(i + "      " + j);
	            }
		 }

	}

}

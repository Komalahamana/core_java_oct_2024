package com.ksg.operator;

public class ShortCirciutDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int x = 10;
	        if ((++x > 10) && (x / 0 > 10)) {
	            System.out.println("Hello");
	        }else {
	            System.out.println("Hi");
	}

}
	
}
package com.ksg.operator;

public class BitWiseOperatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int x = 10;
	        int y = 15;
	        if(++x>10 & ++y<15) {
	            ++x;
	        }else {
	            ++y;
	        }
	        System.out.println(x+"  "+y);

	}

}

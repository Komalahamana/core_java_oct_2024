package com.ksg.oops;

public class Clients1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case 1//
		
		Parent1 p1 = new Parent1() ;
		p1.m1();
		
		//case 2//
		Child1 c1 = new Child1();
		c1.m1();
		c1.m2();
		
		//case 3//
		Parent1 p2 = new Child1();
		p2.m1();
		
		
		
		

	}

}

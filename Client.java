package com.ksg.oops;

public class Client {

	public static void main(String[] args) {

		// Case1
		Parents p1 = new Parents();
		p1.m1();

		// Case2
		Child c1 = new Child();
		c1.m1();
		c1.m2();

		// Case3
		Parents p2 = new Child();
		p2.m1();

	}

}

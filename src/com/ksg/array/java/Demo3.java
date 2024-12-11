package com.ksg.array.java;

public class Demo3 {
	
	int id;
	String name;
	
	public Demo3(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		Demo3 d1 = new Demo3(1,"ajay");
		Demo3 d2 = new Demo3(2,"jinay");
		
		System.out.println(d1.id+" "+d1.name);
		System.out.println(d2.id+" "+d2.name);
		
		
	}
}
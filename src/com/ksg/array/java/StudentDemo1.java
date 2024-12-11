package com.ksg.array.java;

public class StudentDemo1 {
	
	int id;
	String name;
	
	public StudentDemo1(int id, String name) {
		this.id = id;
		this.name = name;
	}
		public static void main (String[] args) {
			StudentDemo1 s1 = new StudentDemo1(101,"ajeet");
			
			StudentDemo1 s2 = new StudentDemo1(201,"jay");
			
			System.out.println(s1.id);
			System.out.println(s1.name);
			System.out.println(s2.id);
			System.out.println(s2.name);
			
	}
	}



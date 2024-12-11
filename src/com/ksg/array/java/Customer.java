package com.ksg.array.java;

public class Customer {
	
	private int id;
	
	private String name;
	
	private Customer (int id,String name) {
		
		this.id = id;
		this.name=name;
		
		
	}
	
	public static void main(String[] args) {
		 
		Customer customer1 = new Customer(101,"ram");
		
		Customer customer2 = new Customer(102,"jay");
		
		System.out.println(customer1.id);
		System.out.println(customer1.name);
		System.out.println(customer2.id);
		System.out.println(customer2.name);
	
}
}
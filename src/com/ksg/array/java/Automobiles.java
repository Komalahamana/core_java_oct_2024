package com.ksg.array.java;

public class Automobiles {
	
	int id;
	String name;
	int salary;
	String company;
	
	public Automobiles (int id,String name,int salary,String company) {
		this.id= id;
		this.name= name;
		this.salary= salary;
		this.company= company;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobiles a1 = new Automobiles(1,"ajay",30000,"maruti suzuki");
		Automobiles a2 = new Automobiles(2,"bharat",32000,"tata");
		Automobiles a3 = new Automobiles (3,"hari",40000,"hyndai");
		Automobiles a4 = new Automobiles (4,"ashok",45000,"mahindrra");
		
		System.out.println(a1.id+ "" +a1.name+ "" +a1.salary+ "" +a1.company);
		System.out.println(a2.id+ "" +a2.name+ "" +a2.salary+ "" +a2.company);
		System.out.println(a3.id+ "" +a3.name+ "" +a3.salary+ "" +a3.company);
		System.out.println(a4.id+ "" +a4.name+ "" +a4.salary+ "" +a4.company);

}
}
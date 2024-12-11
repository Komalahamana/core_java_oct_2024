package com.ksg.java8;

import java.util.ArrayList;
import java.util.Comparator;

public class Java8Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		  a1.add(123);
	        a1.add(9);
	        a1.add(98);
	        a1.add(11);
	        a1.add(24);
	        
	        // finding two minimum numbers 
	        System.out.println("2 Minimum Numbers");
	        a1.stream().sorted().limit(2).forEach(System.out::println);
	        
	        // finding two maximum numbers
	        System.out.println("2 maximum numbers");
	        a1.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out:: println);

	}

}

package com.ksg.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String>vector = new Vector<String>();
		
		vector.add("gourava");
		vector.add("neha");
		vector.add("avinash");
		vector.add("ravi");
		
		 System.out.println(vector);
	        
		 Enumeration<String> e = vector.elements();
	        
	        while(e.hasMoreElements()) {
	            System.out.println(e.nextElement());
	        }
	}
}


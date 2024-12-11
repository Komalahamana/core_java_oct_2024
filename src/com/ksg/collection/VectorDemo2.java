package com.ksg.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("ravi");
		vector.add("puspendra");
		vector.add("raja");
		vector.add("rachait");
		
		 System.out.println(vector);
		  
		 Enumeration<String> e = vector.elements();
	        
	        while(e.hasMoreElements()) {
	            System.out.println(e.nextElement());
	        }
		

	}

}

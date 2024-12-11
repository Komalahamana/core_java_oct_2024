package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(12);
		arraylist.add(78);
		arraylist.add(100);
		arraylist.add(76);
		
		System.out.println("Iterate arraylist by using each loop");
		
		 for (int i = 0; i < arraylist.size(); i++) {
	            System.out.println(arraylist.get(i));
	        }
		
		
System.out.println("Fetching the arraylist using iterator"); 
        
        Iterator<Integer> itr = arraylist.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
	}

}

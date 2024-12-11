package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrentmodificationexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(11);
		list.add(23);
		list.add(54);
		list.add(66);
		
		Iterator<Integer>itr = list.iterator();
		while(itr.hasNext()) {
			
			Integer value = itr.next();              
            System.out.println("List Value:" + value);  
            if (value.equals(5))  
                list.remove(value);  
			
			
			
		}
		
	}

}

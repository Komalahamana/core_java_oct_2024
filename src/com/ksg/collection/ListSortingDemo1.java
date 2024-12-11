package com.ksg.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortingDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(6);
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(3);
		
		 //    List<Integer> list1 = Arrays.asList(1,5,3,6,9,8,4,7,12,11,13);
		
		System.out.println("Unsorted List: "+arrayList);
		
          Collections.sort(arrayList);
        
        System.out.println("Sorted List: "+arrayList);
  
	}
	
	

}

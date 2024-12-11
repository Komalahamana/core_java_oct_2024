package com.ksg.collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreemapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
	        
	        treeMap.put(100, "ZZZ");
	        treeMap.put(103, "YYY");
	        treeMap.put(101, "XXX");
	        treeMap.put(104, "AAA");
	        treeMap.put(105, "BBB");
	        treeMap.put(102, null);
	        treeMap.put(100, "DDD");
	        
	        System.out.println("Iterate the arrayList using for each loop");
	       
	        
	        
	        Iterator<Integer> itr = treeMap.iterator();
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	    }
	        System.out.println("Iterate the arrayList using for each loop"); 
	        
	        for(int i:treeMap) {
	            System.out.println(i);
	        
	}
	        System.out.println("Fetching the arrayList using advance for each");
	        
	        treeMap.forEach((e)->{System.out.println(e);});
	}


}
package com.ksg.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer> ();
		
		arrayList.add(11);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(null);
		
		Iterator<Integer> itr = arrayList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		}
		

		}
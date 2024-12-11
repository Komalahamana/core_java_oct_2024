package com.ksg.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedlist = new LinkedList<>();
		
		linkedlist.add("ravi");
		linkedlist.add("komal");
		linkedlist.add("vikas");
		linkedlist.add("gourav");
		
		Iterator<String>itr = linkedlist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

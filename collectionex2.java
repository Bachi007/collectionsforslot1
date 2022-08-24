package com.bankApp;

import java.util.Iterator;
import java.util.LinkedList;

public class collectionex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Mango");
		ll.add("Apple");
		ll.add("Mango");
		ll.add("Kiwi");
		ll.add("Jack Fruit");
		ll.add("Banana");
		
		ll.removeLastOccurrence("Mango");
		ll.removeLast();
		
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		}
		}

}

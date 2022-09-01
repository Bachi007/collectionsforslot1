package com.bankApp;

import java.util.LinkedList;

public class collectionpack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("OnePlus");
		ll.add("Samsung");
		ll.add("Sony");
		ll.add("Pixel");
		ll.add("Oppo");

		ll.set(1, "bhaskar");
		System.out.println(ll);		
		
		LinkedList <String> ll2 = new LinkedList<String>();
		ll2.add("Samsung");
		ll2.add("OnePlus");
		ll.addAll(ll2);
		ll.removeLastOccurrence("OnePlus");
		System.out.println("---After adding---");		
		
		System.out.println(ll);		
		
	}

}

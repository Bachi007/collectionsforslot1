package com.bankApp;

import java.util.TreeSet;

public class collectionex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <String> ts= new TreeSet<String>();
		
		ts.add("Honda CB 650");
		ts.add("NS 200");
		ts.add("KTM Adv 350");
		ts.add("Ducati Multistarda");
		ts.add("Dominar 400");
		
		System.out.println(ts.pollLast());
		
		
		for(String i:ts) {
			//System.out.println(i);
		}
		
	}

}

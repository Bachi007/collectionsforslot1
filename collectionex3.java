package com.bankApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class collectionex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> set=new HashSet<String>();
		
		set.add("Mango");
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");
		
		ArrayList <String> al =new ArrayList<String>(set);
		
		Collections.sort(al);
		
		for(String i:al) {
			System.out.println(i);
		}
	}

}

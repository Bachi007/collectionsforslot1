package com.bankApp;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class collectionpack3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Angular");
		hs.add("React");
		hs.add("Nodejs");
		hs.add("Express");
		hs.add("Spring boot");
		hs.add("Bootstrap");
		hs.add("Angular");
		LinkedList<String> ll =new LinkedList<String>(hs);
		Collections.sort(ll);
		System.out.println(ll);
		
		
		
		
	}

}

package com.bankApp;

import java.util.ArrayList;
import java.util.Collections;

public class collectionlambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(5);
		al.add(10);
		al.add(30);
		al.add(45);
		al.add(87);
		al.add(39);
		al.add(43);
		al.add(27);
		
		Collections.sort(al,(o1,o2)->(o1>o2)? -1:(o1<o2)? 1:0);
		
		al.forEach(System.out::println);
		
	}

}

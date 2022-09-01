package com.bankApp;

import java.util.TreeMap;

public class collectionlambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>((o1,o2)->(o1>o2)? -1:(o1<o2)?1:0);
		
		//compare()=> 3, -1,1,0
		/*
		 * -1 ele 1 comes before ele 2
		 * 1 ele 1 after ele 2
		 * 0 ele 1== ele 2
		 * 
		 */
		
		tm.put(1, "Jhon");
		tm.put(3, "Doe");
		tm.put(2, "Alex");
		tm.put(5,"Carey");
		tm.put(4, "Lara");
		
		System.out.println(tm);
		
	}

}

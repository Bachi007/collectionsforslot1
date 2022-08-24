package com.bankApp;

import java.util.TreeMap;

public class collectionex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
		tm.put(3,"Bhaskar");
		tm.put(1, "John");
		tm.put(0,"alex" );
		tm.put(2, "joe");
		
		tm.forEach((ind,val)->{
			System.out.println(ind+" : "+val);
		});
		
	}

}

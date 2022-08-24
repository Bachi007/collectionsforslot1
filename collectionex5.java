package com.bankApp;

import java.util.HashMap;
import java.util.Map;

public class collectionex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "Bhaskara");
		hm.put(1, "Santu");
		hm.put(2, "Anudip");
		
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		/*hm.forEach((ind,val)->{
			System.out.println(ind+" : "+val);
		});*/
		
	}

}

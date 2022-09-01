package com.bankApp;

import java.util.HashMap;

public class collectionpack4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer> hm= new HashMap<String,Integer>();
		hm.put("bhaskar", 25);
		hm.put("Anudip", 20);
		hm.put("John", 15);
		hm.put("Doe",12);
		hm.put("bhaskar", 20);
		hm.forEach((studentName,studentMarks)->
			System.out.println(studentName+": "+studentMarks)
				);
	}

}

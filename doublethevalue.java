package com.bankApp;

import java.util.Arrays;
import java.util.List;

public class doublethevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al=Arrays.asList(15,20,5,6,5);
		
		al.forEach(doublethevalue::doubleIt);
	}
	
	public static void doubleIt(int x) {
		System.out.println(x*x);
	}

}

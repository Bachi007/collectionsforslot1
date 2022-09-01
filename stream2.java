package com.bankApp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.iterate(1,i->i+1)
		.limit(100)
		.filter(i->i%2==0)
		
		.forEach(System.out::println);
		
		
		//1,2,3,4,5,6,7,...100
		
		
	}

}

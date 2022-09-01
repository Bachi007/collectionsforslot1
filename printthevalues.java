package com.bankApp;

import java.util.ArrayList;

public class printthevalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> al =new ArrayList<>();
		
		for(int i=1;i<=10;i++)
			al.add(i);
		
		al.parallelStream().forEach(i->System.out.println(i));
		
		
	}

}

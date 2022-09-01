package com.bankApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamapi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> al=new ArrayList<>();
		
		for(int i=1;i<=10;i++)
		al.add(i);
		
//		ArrayList <Integer> al2=new ArrayList<>();
//		for(int j=1;j<al.size();j++)
		//2,4,6,8,10
//		al2.add(al.get(j)*5);
		al.stream().filter(i->i%2==0).forEach(System.out::println);
		
		
		
		
	
	}

}

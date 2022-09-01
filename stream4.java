package com.bankApp;

import java.util.ArrayList;
import java.util.function.Predicate;

public class stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> bs=new ArrayList<String>();
		bs.add("Jack");
		bs.add("James");
		bs.add("Joe");
		bs.add("Jerry");
		bs.add("Jhony");
		bs.add("Tom");
		bs.add("bhaskar");
		
		
		Predicate<String> startWithJ = (i)->i.startsWith("J");
		Predicate <String> fourletterWord = i->i.length()>4;
		
		bs.stream()
		.filter(startWithJ.and(fourletterWord))
		.forEach(System.out::println);
		
		
		
		
		
		
	}

}

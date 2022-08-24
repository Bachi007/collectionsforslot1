package com.bankApp;
import java.util.*;
public class collectionex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Mango");
		al.add("Kiwi");
		al.add("Apple");
		al.add("Jack Fruit");
		al.add("Grapes");
		al.set(1,"Orange");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Banana");
		al2.add("Pineappls");
		al.addAll(al2);
		al.remove(0);
	for(String i:al) {
		System.out.println(i);
	}
	
	}

}

package com.bankApp;

import java.util.Collections;
import java.util.LinkedList;

public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//books creation
		book b1=new book(121,"Head first to Java",1200);
		book b2=new book(120,"Ng Angular intro",700);
		book b3=new book(123,"objective C",400);
		book b4=new book(122,"Intro to Java EE",2000);
		//adding books to list to perform sorting
		LinkedList <book> ll=new LinkedList<book>();
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		//sorting
		Collections.sort(ll);
		//iterating over list
		for(book b:ll) {
			System.out.println(b.bookId +" is "+b.bookName+" and price : "+b.bookPrice);
			
		}
		
	}

}

package com.bankApp;

public class book implements Comparable<book>{

	int bookId;
	String bookName;
	int bookPrice;
	public book(int bookId, String bookName, int bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	@Override
	//comparable basesd on price
	public int compareTo(book b1) {
		if(bookPrice==b1.bookPrice) {
			return 0;		
		}
		if(bookPrice>b1.bookPrice) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
}

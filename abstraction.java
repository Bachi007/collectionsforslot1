package com.bankApp;


abstract class bhaskar{
	
	public abstract void display2(String username);
	
	public void display(String username) {
		System.out.println("Hello "+username);
	}
	
}



public class abstraction extends bhaskar {

	public void display2(String username) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		abstraction abs=new abstraction();
		abs.display("Bhaskar");
		
		
	}

}

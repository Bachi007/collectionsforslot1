package com.bankApp;

@FunctionalInterface
interface add{
  public int addition(int a,int b); 
}

public class addlambda {

	public static void main(String args[]) {
		
		
		add a=(b,c)->{return b+c;};
		
		System.out.println(a.addition(5, 15));
		
		
	}
	
}

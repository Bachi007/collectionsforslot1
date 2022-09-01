package com.bankApp;

public class calclambda {

	public static void main(String[] args) {
		
		addlambd ad=(a,b)->{return a+b;};
		sublambd su=(a,b)->{return b-a;};
		
		
		System.out.println(ad.addition(5, 10));
		System.out.println(su.subtraction(5, 10));
		
		
	}

}

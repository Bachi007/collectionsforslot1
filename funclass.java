package com.bankApp;


@FunctionalInterface
interface fun {
	String display(String username);
}
public class funclass{
	public static void main(String[] args) {
		fun f=(bs)->{ 	return "Hello "+bs;	};	
		
		System.out.println(f.display("anudip"));		
	}
}

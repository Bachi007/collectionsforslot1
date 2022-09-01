package com.bankApp;

@FunctionalInterface
interface anudipkolkata{
	
	public String webdesigning(String username);
	
}
public class samplelambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		anudipkolkata anp=(user)->{return "Hello "+user+" Welcome";};
		
		System.out.println(anp.webdesigning("Bhaskar"));
		
	}

}

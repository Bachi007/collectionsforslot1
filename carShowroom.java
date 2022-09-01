package com.bankApp;

import java.util.*;


public class carShowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		car b1=new car("Ferrari","h2",1326,5);
		car b2=new car("Vovlo","xc90",1000,8);
		car b3=new car("Audi","Q8",1300,10);
		
		LinkedList <car> ll=new LinkedList<car>();
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		//sorting
		Collections.sort(ll);
		for(car c:ll) {
			System.out.println(c.carCompany+" - "+c.carModel);
		}
	}

}

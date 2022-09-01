package com.bankApp;

import java.util.Collections;
import java.util.LinkedList;

public class bikeShowRoom {

	public static void main(String args[]) {
		
		
		bike b1=new bike("BMW","1250GSA",22000,20,101);
		bike b2=new bike("Honda","African Twin",13000,40,103);		
		bike b3=new bike("Ducati","Multistarda",28000,30,102);
		
		LinkedList<bike> ll=new LinkedList<bike>();
		ll.add(b3);
		ll.add(b2);
		ll.add(b1);
		Collections.sort(ll,new bikePriceComparator());
		System.out.println("Bikes based on price");
		for(bike b:ll)
		System.out.println(b.bikeCompany+"-> "+b.bikeModel);
		
		Collections.sort(ll,new bikeMileageComparator());
		System.out.println("Bikes based on Mileage");
		for(bike b:ll)
		System.out.println(b.bikeCompany+"-> "+b.bikeModel);
		
		
		
		
		
	}
	
}

package com.bankApp;

import java.util.ArrayList;
import java.util.Collections;

public class mobileshoppy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile m1=new mobile(7,45000,"Oneplus 9RT",8);
		mobile m2=new mobile(5,70000,"Pixel 6 Pro",6);
		mobile m3=new mobile(6,100000,"Samsung S22 Ultra",12);
		mobile m4=new mobile(7,80000,"Apple iphone 13",6);
		
		ArrayList <mobile> al=new ArrayList<mobile>();
		al.add(m4);
		al.add(m3);
		al.add(m2);
		al.add(m1);
		
		System.out.println("----Mobile based on Price----");
		Collections.sort(al, new priceComparator());
		for(mobile m:al)
			System.out.println(m.mobileId+" is "+m.mobileModel+" and cost is "+m.mobilePrice+" and RAM is"+m.mobileRam+"gb");
		
		System.out.println("----Mobile based on RAM----");
		Collections.sort(al, new ramComparator());
		for(mobile m:al)
			System.out.println(m.mobileId+" is "+m.mobileModel+" and cost is "+m.mobilePrice+" and RAM is"+m.mobileRam+"gb");
		
		
		
	}

}

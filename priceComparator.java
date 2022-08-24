package com.bankApp;

import java.util.Comparator;

public class priceComparator implements Comparator <mobile> {

	@Override
	public int compare(mobile m1, mobile m2) {
		// TODO Auto-generated method stub
		if(m1.mobilePrice==m2.mobilePrice)
		return 0;
		if(m1.mobilePrice>m2.mobilePrice)
			return 1;
		else
			return -1;
	}

	
}

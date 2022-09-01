package com.bankApp;

import java.util.Comparator;

public class bikePriceComparator implements Comparator <bike> {

	@Override
	public int compare(bike b1, bike b2) {
		// TODO Auto-generated method stub
		if(b1.bikePrice==b2.bikePrice)
		return 0;
		if(b1.bikePrice>b2.bikePrice)
			return 1;
		else
			return -1;
	}

}

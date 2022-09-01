package com.bankApp;

import java.util.Comparator;

public class bikeMileageComparator implements Comparator <bike> {

	@Override
	public int compare(bike b1, bike b2) {
		// TODO Auto-generated method stub
		if(b1.bikeMileage==b2.bikeMileage)
		return 0;
		if(b1.bikeMileage>b2.bikeMileage)
			return 1;
		else
			return -1;
	}

}

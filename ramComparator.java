package com.bankApp;

import java.util.Comparator;

public class ramComparator implements Comparator <mobile>{

	@Override
	public int compare(mobile m1, mobile m2) {
		// TODO Auto-generated method stub
		if(m1.mobileRam==m2.mobileRam)
		return 0;
		if(m1.mobileRam>m2.mobileRam)
			return 1;
		else
			return -1;
	}

}

package com.bankApp;

public class car implements Comparable<car> {

	String carCompany;
	String carModel;
	int carPrice;
	int carMileage;
	public car(String carCompany, String carModel, int carPrice, int carMileage) {
	
		this.carCompany = carCompany;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carMileage = carMileage;
	}
	public int compareTo(car c1) {
		if(carPrice==c1.carPrice)
			return 0;
		if(carPrice>c1.carPrice)
			return 1;
		else
			return -1;
	}
	
	
}

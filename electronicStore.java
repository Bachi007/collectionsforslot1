package com.bankApp;

import java.util.ArrayList;

public class electronicStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		electronics e1=new electronics(101,"OnePlus","9 RT mobile",45000,2022);
		electronics e2=new electronics(102,"OnePlus","Y series TV",25000,2021);		
		electronics e3=new electronics(103,"Samsung","Galaxy s22 ultra",95000,2021);
		electronics e4=new electronics(104,"Samsung","OLED TV",92000,2020);
		electronics e5=new electronics(105,"OnePlus","Watch 1",15000,2020);
		
		ArrayList<electronics> al=new ArrayList<electronics>();
		
		al.add(e5);
		al.add(e4);
		al.add(e3);
		al.add(e2);
		al.add(e1);
	
		al.stream()
		.filter(pro->pro.ePrice<30000)
		.forEach(pro->{
			System.out.println(pro.eCompany+" "+pro.eName+" Rs: "+pro.ePrice);
		});
		
	
	
	
	}

}

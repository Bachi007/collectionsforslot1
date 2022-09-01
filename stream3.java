package com.bankApp;
import java.util.function.*;
public class stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var age=15;
		var bs="Bhaskara";
		
		Predicate<Integer> lowerageCheck=(i)->i>18; 
		Predicate<Integer> upperageCheck=(i)->i<60; 
		if(lowerageCheck.and(upperageCheck).test(age))
		System.out.println("you are eligible");
		else
			System.out.println("you are not eligible");
	}

}

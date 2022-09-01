package com.bankApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingdata {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f1=new File("d:sample.txt");
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
			
		}
		sc.close();
			
	}

}

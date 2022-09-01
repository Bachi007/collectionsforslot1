	package com.bankApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1=new File("d:helloworld.java");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the content to store");
		String data=sc.nextLine();
		if(f1.createNewFile()) {
			FileWriter fw= new FileWriter(f1);
			fw.write(data);
			fw.close();
		}
		else {
			System.out.println("File is not created");
		}
		
		
	}

}

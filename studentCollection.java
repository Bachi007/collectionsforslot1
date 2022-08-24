package com.bankApp;

import java.util.ArrayList;

public class studentCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(120,"Bhaskar",25);
		Student s2=new Student(121,"Santu",26);
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		
		for(Student i:al)
			System.out.println(i.roLLNum+" is "+i.stuName);
	}

}
class Student{
	int roLLNum;
	String stuName;
	int age;
	public Student(int roLLNum, String stuName, int age) {
		this.roLLNum = roLLNum;
		this.stuName = stuName;
		this.age = age;
	}
	
}

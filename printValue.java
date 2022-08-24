package com.bankApp;

import java.time.YearMonth;

//resource
class counter{
	int i=0;
	public synchronized void increment() {
		i++;
	}
}



public class printValue {

	public static void main(String[] args) throws InterruptedException {

		  YearMonth ym = YearMonth.now();  
		  System.out.println(ym);
		counter c=new counter();
		
	
		Thread t1= new Thread()
		{		
			public void run() {
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		};
	
		Thread t2=new Thread()
		{
			public void run() {
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(c.i);
		
		
	}
}

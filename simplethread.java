package com.bankApp;

class counterpro{
	
	int i;
	public synchronized void increment() {
		i++;
	}
	
}

public class simplethread {

	public static void main(String[] args) throws InterruptedException {
		
		counterpro cp=new counterpro();
		
		Thread t1= new Thread() {
			
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					cp.increment();
				}
			}
			
		};
		Thread t2=new Thread() {
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					cp.increment();
				}
			}
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	System.out.println(cp.i);	
		
		
	}

}

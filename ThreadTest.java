package com.bankApp;


class MyThread extends
Thread {public void
run() {
System.out.println("Executing while loop");
while(true){}
}
} public class ThreadTest {
public static void main(String args[]) throws
Exception {MyThread thread1 = new
MyThread(); thread1.start();
Thread.sleep(5000);
thread1.interrupt();
}
}

package edu.neu.csye6200.concrun;

public class MyRunTest {
	//two threads running simultaneously and are in sync
	MyRunnable myRunA = null;
	Thread threadA = null;
	MyRunnable myRunB = null;
	Thread threadB = null;
	
	public MyRunTest() {
		myRunA = new MyRunnable("A");//create a runnable
		threadA = new Thread(myRunA);//create a thread and pass a runnable  variable
		
		myRunB = new MyRunnable("B");//create a runnable
		threadB = new Thread(myRunB);//create a thread and pass a runnable  variable
	}
	
	public void run() {
		threadA.start();//start the thread
		threadB.start();//start the thread
	}
	public static void main(String[] args) {
		MyRunTest mrtest= new MyRunTest();//inintialise the thraeds
		mrtest.run(); //start the threads running
			
	}

}

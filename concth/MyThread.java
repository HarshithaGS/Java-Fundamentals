package edu.neu.csye6200.concth;

//concurrent using threads
public class MyThread extends Thread {
	private boolean done = false;//we are not done initially
	private int ctr =0;// how many times around the loop??
	
	//Constructor -witha a name
	public MyThread(String name) {
		
	}
	public void run() {
		while(!done) {
			doWork();//Do important time consuming work
			ctr++;//count how many times around the loop
			System.out.println("Thread: " + this.getName() +  + ctr);//this.getName is redundaant. this can be removed
			if(ctr>10) 
				done =true;
		}
	}
	
	public void doWork() {
		for(int i=0; i<100; i++) {
			double val = Math.exp((double)i);
		}
	}
}

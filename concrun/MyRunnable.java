package edu.neu.csye6200.concrun;

//instead of a creating a thread it is just a runnable class
public class MyRunnable implements Runnable {

	private String name;
	private boolean done = false;//We are not done initially
	private boolean paused = false;
	private int ctr =0;

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while(!done) {
			if(ctr == 50)
				paused = true;
			if(ctr ==60)
				paused = false;
			if(paused) {
				try {
					Thread.sleep(1000L);//good to have some sleep time when infinite loops going on. But not compulsory
					ctr++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else {
				doWork();
				ctr++;
				if((ctr% 10)==0)
					System.out.println("Thread: " + name + "-loop:" +ctr);
				if(ctr>100)
					done=true;
			}
		}
	}

	public void doWork() {
		for(int i=0; i<100; i++) {
			double val = Math.exp((double)i);
		}
	}
}

package edu.neu.csye6200.timer;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	
	private Timer timer ;
	
	//Constructor
	public TimerDemo() {
		timer = new Timer();
		//task, delay time , periodic delay
		timer.schedule(new RemindTask(), 3000L, 1000L);//3 ms = delay time , 1 ms = periodic delay
	}
	
	//A timer class
	class RemindTask extends TimerTask {
		private int ctr = 0;
		
		@Override
		public void run() {//inner class . it is able to see timer  variable . giving instant visibility to outer class
			System.out.println("Timer Alert" + ctr++);	
			Toolkit.getDefaultToolkit().beep();//Ring the bell
			if(ctr>5)timer.cancel();
		}
	}
	
	public static void main(String[] args) {
		new TimerDemo();			
	}

}

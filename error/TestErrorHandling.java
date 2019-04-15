package edu.neu.csye6200.error;

import java.io.IOException;

public class TestErrorHandling {

	public void run() {
		testCatch();
	}
	
	//lets call the error prone method
	public void testCatch() {
		try {
			testError(6);
		} catch (IOException e) {
			System.out.println("ERROR:"+e.getLocalizedMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//could produce an exception
	public void testError(int val) throws Exception {
		if(val>5) 
			throw new IOException("This is an IO error");	
		if(val<2)
			throw new IllegalArgumentException("This is a IA error");
	}

	public static void main(String[] args) {
		TestErrorHandling teh = new TestErrorHandling();
		teh.run();
	}

}

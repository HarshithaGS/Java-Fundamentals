package edu.neu.csye6200.obs;

import java.util.Observable;

//class which will give the news of the events to all the other classes
public class EventPublisher extends Observable {//not a good thing to impement this pattern generally. should be stricked out
	
	private boolean done = false; // set true to stop the run method
	private int ctr = 0; //count how many times we loop around
	
	//Constructor
	public EventPublisher() {
		System.out.println("EventPublisher - we are here");	
	}
	
	//An event has occured , so notify the subscribers
	public void doAction() {
		setChanged();//Indicate that a change has happenend
		notifyObservers(new String("A message" + ctr++));		
	}
	
	//Do a lot of messaging
	public void run() {
		while(!done) {
			doAction();
			if(ctr >10)
				done =true;
		}
	}
	
	public static void main(String[] args) {
		EventPublisher ep = new EventPublisher(); //We have a publisher
		EventSubscriber sub1 = new EventSubscriber();//We have a subscriber
		ep.addObserver(sub1);//make the subscription 
		ep.run();
	}

}

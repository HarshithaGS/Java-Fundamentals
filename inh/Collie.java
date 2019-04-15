package edu.neu.csye6200.inh;

public class Collie extends Dog {

	public Collie(String name, double speed, int legs) {
		super(name, speed, legs);
	}
	public void bark() {//overriding the bark method . wanted to make changes.hence override
		System.out.println("Woof!");
	}
	
	public void wagTail() { // new method which is applied only for collie and not the dog
		System.out.println("Wag Tail");
	}
	public String getid() {
		// TODO Auto-generated method stub
		return null;
	}

}

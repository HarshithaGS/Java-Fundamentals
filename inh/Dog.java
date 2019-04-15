/**
 * 
 */
package edu.neu.csye6200.inh;

/**
 * @author HarshithaGS
 *
 */
public class Dog {
	
	static private int idCounter = 0;
	static double airTemp;
	private int id;
	
	private int legs;
	private double speed;
	private String name = "";

	//constructor
	public Dog(String name , double speed, int legs){
		this.name =name;
		this.speed = speed;
		this.legs = legs;
		id =idCounter++ ;
	}
	
	//constructor
	public Dog(String name , String speed){
		this.name =name;
		this.speed = Double.valueOf(speed);
		this.legs = 4;
		id =idCounter++ ;
	}
	
	
	
	public void bark() {
		System.out.println("Bark");
	}
	
	
	
	public String getName() {
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		if (legs < 0) legs =0;//Don't allow negative legs. Am taking control of it
		this.legs = legs;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String toString() {
		return String.format("Dog> %1$12s %2$5.2f %3$01d", getName() ,getSpeed() , getLegs());
		
	}

	
}

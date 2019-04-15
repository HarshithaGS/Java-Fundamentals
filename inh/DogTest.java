/**
 * 
 */
package edu.neu.csye6200.inh;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author HarshithaGS
 *
 */
public class DogTest {

	private Dog simpleDog;
	private Dog simpleDog2;
	private Collie simpleCollie;

	private ArrayList <Dog> dogList;//an arrayList class 
	private HashMap<String,Dog> dogMap;// a hashmap class
	
	//constructor
	public DogTest(){
		double airTemp = Dog.airTemp;

		dogList = new ArrayList<Dog>();//cretae an arraylist instance
		dogMap = new HashMap<String , Dog>(); //Create a hashmap instance
		

		simpleDog = new Dog("fido",10.0,4);
		simpleDog2 = new Dog ("fido","9.1");
		simpleCollie = new Collie("Tramp",12.0,4);
	}


	// a run method
	private void run() {// anyways this method is being accessed in the main method.
		
		System.out.println("My simple Dog :"+ simpleDog.getName());
		simpleDog.bark();
		System.out.println("My simple Dog ID is :"+ simpleDog.getId());

		System.out.println("My simple Collie :"+ simpleCollie.getName());
		simpleCollie.bark();
		simpleCollie.wagTail();
		System.out.println("My simple Collie ID is :"+ simpleCollie.getId());
		
		//add to the list
		dogList.add(simpleDog);
		dogList.add(simpleDog2);
		dogList.add(simpleCollie);
		
		
		//add to the map
		dogMap.put(simpleDog.getName(), simpleDog);
		dogMap.put(simpleDog2.getName(), simpleDog2);
		dogMap.put(simpleCollie.getName(), simpleCollie);

		for (Dog dg : dogList) {
			System.out.println("Before: "+dg);
		}
		
		dogList.remove(1);
		
		for (Dog dg : dogList) {
			System.out.println("After: "+dg);
		}
		
		for (Dog dg : dogMap.values()) {
			System.out.println("Map: "+dg);
		}
		Dog bulletDog = dogMap.get("Tramp");
		System.out.println("My dog is " + bulletDog);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DogTest dt = new DogTest();
		dt.run();// run my DogTest program
	}

}

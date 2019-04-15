package edu.neu.csye6200.inherit;

import java.util.ArrayList;
import java.util.logging.Logger;
//example of singleton class
public class MeterManager {
	
	public static Logger log = Logger.getLogger(MeterManager.class.getName());
			
	private static MeterManager instance = null; // The one and only copy of the inst
	private ArrayList<MeterI> meterList  = new ArrayList<MeterI>();
	
	private MeterManager() {//cant be built externally to class
			log.info("constructing a meter manager instnace ");
		}
	
	public static MeterManager instance () {
		if (instance ==null) instance = new MeterManager();
		return(instance);
	}
	
	public void add(MeterI meter) {
		meterList.add(meter);
		log.warning("Added a meter");
	}
	
	public void displayMeters() {
		for(MeterI meter :meterList) {
			String fTxt = String.format("Measure : %1$8f %2$8f", meter.measure(), meter.getResistivity());
			System.out.println(fTxt);
		}
	}
}

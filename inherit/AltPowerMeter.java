package edu.neu.csye6200.inherit;

public class AltPowerMeter extends PowerMeasure {//since alt power meter is inheriting powermeasure and inturn powermeasure implemenst meterI even altpowermeausre is meterI
	
	public AltPowerMeter() {
		System.out.println("AltPowerMeasure constructor called");
	}
	
	//V = IR
	//@Override// if override was written here and if it was resisivity then it would give  error because there was no such method in th einterface which has to be overridden
		public double getResistivity() {
		//	return (voltage/current)*2;
			return super.getResistivity()*2;		}
}

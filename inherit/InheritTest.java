package edu.neu.csye6200.inherit;

public class InheritTest {
	//constructor
	public InheritTest() {}

	public void run() {
		PowerMeasure pm0 = new PowerMeasure();
		System.out.println("Power Measure Resistivity: " + pm0.getResistivity());
		
		AltPowerMeter apm0 = new AltPowerMeter();
		System.out.println("AlternatePowerMeasure Resistivity: " + apm0.getResistivity());
		
		displayMeter(apm0); // it is-a MeterI
		//static call  to create  an instance of MeterManager
		MeterManager meterMgr = MeterManager.instance();
		meterMgr.add(pm0);
		meterMgr.add(apm0);
		meterMgr.displayMeters();
		
		MeterManager meterMgr2 = MeterManager.instance();
		meterMgr2.displayMeters();
	}
	
	public void displayMeter(MeterI meter) {
		System.out.println("measure is :" + meter.measure());
	}
	
	public static void main(String[] args) {
		InheritTest iTest = new InheritTest();
		iTest.run();
	}

}

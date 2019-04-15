package edu.neu.csye6200.inherit;

public class PowerMeasure extends MeterA implements MeterI {
	
	protected double current =1.0;// 1 Amp
	protected double voltage = 12.0;// 12 Volts
	
	//constructor
	public PowerMeasure() {
		System.out.println("PowerMeasure constructor called");
	}
	
	//V = IR
	
	public double getResistivity() {
		return voltage/current;
	}

	@Override
	// from inheritance class MeterI
	public double measure() {
		return voltage*current;
	}

	@Override
	//from abstract class MeterA
	public double calcProbeMeasure() {
		// TODO Auto-generated method stub
		return 0;
	}
}

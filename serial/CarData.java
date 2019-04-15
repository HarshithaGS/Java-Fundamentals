package edu.neu.csye6200.serial;

import java.io.Serializable;


@SuppressWarnings("serial")
public class CarData implements Serializable , Comparable<CarData> {

	private int iValue =0;
	private double dValue =0.1;
	private double dValue2 = 0.2;
	private String name;
	
	//constructor
	public CarData(int iValue , double dValue , double dValue2 , String name) {
			this.setiValue(iValue);
			this.setdValue(dValue);
			this.setdValue2(dValue2);
			this.setName(name);
	}

	@Override
	public int compareTo(CarData cd) {
		return name.compareTo(cd.getName());
	}

	
	//getters and setters
	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public double getdValue() {
		return dValue;
	}

	public void setdValue(double dValue) {
		this.dValue = dValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getdValue2() {
		return dValue2;
	}

	public void setdValue2(double dValue2) {
		this.dValue2 = dValue2;
	}
}

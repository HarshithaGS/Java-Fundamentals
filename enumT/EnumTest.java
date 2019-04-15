package edu.neu.csye6200.enumT;

public class EnumTest {

	//private int dayOfWeek =2 ;//Tuesday-----he said something . but basically need not write like this 

	enum WeekDay{ SUNDAY(0) , MONDAY(10) , TUESDAY(20) , WEDNESDAY(30) , THURSDAY(40) , FRIDAY(50) , SATURDAY(60) ;

		private int value;
		//constructor
		WeekDay(int n) { value = n ;}
		//getter and Setters
		public void setValue(int value) { this.value = value;}
		public int getValue() {return value;}

	};

	private WeekDay currDay = WeekDay.TUESDAY;

	//Constructor
	public EnumTest() {
		System.out.println("Current Day is : " + currDay + "ordinal value :" + currDay.ordinal());//ordinal gives the location in the enum declarartion

		WeekDay days[] = WeekDay.values();
		for(WeekDay d : days) {
			System.out.println("Day :" + d.name() + "\t" + "ordinal : " + "\t" + d.ordinal() + "\t" + "value:" + d.value );
		}
		setCurrDay(WeekDay.SATURDAY);
		setCurrDay(WeekDay.SATURDAY);
	}

	public void setCurrDay (WeekDay currDay) {
		this.currDay =currDay;
	}

	public static void main(String[] args) {
		EnumTest et = new EnumTest();
	}

}

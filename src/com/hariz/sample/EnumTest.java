package com.hariz.sample;

public class EnumTest {
	Day day;

	public EnumTest (Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("Friday are better");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are the best");
			break;
		default:
			System.out.println("Midweeks are so-so");
			break;
		}
	}
	public static void main(String [] args) {
		EnumTest firstday = new EnumTest(Day.MONDAY);
		firstday.tellItLikeItIs();
		EnumTest secondday = new EnumTest(Day.TUESDAY);
		secondday.tellItLikeItIs();
		EnumTest thirdday = new EnumTest(Day.WEDNESDAY);
		thirdday.tellItLikeItIs();
		EnumTest forthday = new EnumTest(Day.THURSDAY);
		forthday.tellItLikeItIs();
		EnumTest fifth = new EnumTest(Day.FRIDAY);
		fifth.tellItLikeItIs();
		EnumTest sixth = new EnumTest(Day.SATURDAY);
		sixth.tellItLikeItIs();
		EnumTest seventh = new EnumTest(Day.SUNDAY);
		seventh.tellItLikeItIs();
	}
}

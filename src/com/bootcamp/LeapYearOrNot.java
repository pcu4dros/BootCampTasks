package com.bootcamp;

import com.bootcamp.interfaces.LeapYear;

public class LeapYearOrNot implements LeapYear {

	@Override
	public String isLeapYear(long year){
		long multipleOfFour = year % 4;
		long multipleOfFourHundred = year % 400;
		long multipleOfOneHundred = year % 100;
		
		if(!(multipleOfOneHundred == 0) || multipleOfFourHundred == 0){
			if(multipleOfFour == 0){
				return "Leap Year";
			}
		}
		
		return "Not Leap Year";
	}

}

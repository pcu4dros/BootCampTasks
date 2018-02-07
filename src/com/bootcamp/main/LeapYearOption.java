package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.LeapYearOrNot;

public class LeapYearOption {

	private LeapYearOrNot leapYearOrNot;
	private Scanner year;
	private String result;

	public void optionLeapYear(){
		try {
			leapYearOrNot = new LeapYearOrNot();

			System.out.println("------Is Leap Year------");
			System.out.println("Please, digit a year in format (yyyy) to know is leap year or not");

			year = new Scanner(System.in);
			long convertedNumber = year.nextLong();

			if (convertedNumber < 0) {
				throw new IllegalArgumentException("!! negative number not allowed !!");
			} else {
				result = leapYearOrNot.isLeapYear(convertedNumber);
			}
			
			System.out.println("The year " + convertedNumber +" is " + result);

		} catch (InputMismatchException imex) {
			System.err.println("!! Ouch !! Please digit a valid year...\n");
		} catch (IllegalArgumentException iare) {
			System.err.println(iare.getMessage());
		}
	}
}

package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.LastDigitOfNumber;

public class LastDigitOption {
	
	private LastDigitOfNumber lastDigitOfNumber;
	private Scanner number;
	private long result;

	public void optionLastDigit(){
		try {
			lastDigitOfNumber = new LastDigitOfNumber();

			System.out.println("------Last Digit of a Number------");
			System.out.println("Please, digit a number to know the last digit");

			number = new Scanner(System.in);
			long convertedNumber = number.nextLong();

			result = lastDigitOfNumber.getLastDigit(convertedNumber);
			
			System.out.println("The last digit of the number " + convertedNumber +" is " + result);

		} catch (InputMismatchException imex) {
			System.err.println("!! Ouch !! Please digit a valid number...\n");
		}
	}
}

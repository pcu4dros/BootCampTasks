package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.ReverseNumber;


public class ReverseNumberOption {

	private ReverseNumber reverseNumber;
	private Scanner number;
	private long result;

	public void optionReverse(){
		try {
			reverseNumber = new ReverseNumber();

			System.out.println("------Truncate a Number------");
			System.out.println("Please, digit a number to truncate");

			number = new Scanner(System.in);
			long convertedNumber = number.nextLong();

			result = reverseNumber.getReverseNumber(convertedNumber);
			
			System.out.println("The reversed number of " + convertedNumber +" is " + result);

		} catch (InputMismatchException imex) {
			System.err.println("!! Ouch !! Please digit a valid number...\n");
		}
	}
}

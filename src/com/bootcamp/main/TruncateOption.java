package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.TruncateNumber;

public class TruncateOption {

	private TruncateNumber truncateNumber;
	private Scanner number;
	private long result;

	public void optionTruncate(){
		try {
			truncateNumber = new TruncateNumber();

			System.out.println("------Truncate a Number------");
			System.out.println("Please, digit a number to truncate");

			number = new Scanner(System.in);
			long convertedNumber = number.nextLong();

			result = truncateNumber.getTruncatedNumber(convertedNumber);
			
			System.out.println("The truncated number for " + convertedNumber +" is " + result);

		} catch (InputMismatchException imex) {
			System.err.println("!! Ouch !! Please digit a valid number...\n");
		}
	}
}

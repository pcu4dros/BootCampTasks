package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.Multiples;

public class MultiplesOption {

	private Multiples multiples;
	private Scanner number;
	private Scanner firstNumber;
	private Scanner secondNumber;
	private String isMultiple;
	private String result;

	public void optionIsMultiple() {
		try {
			multiples = new Multiples();

			System.out.println("------Is Multiple------");
			System.out.println("Please, digit two numbers to validate if first ");
			System.out.println("is multiple of the second \n");
			
			System.out.println("Digit the first number: ");

			firstNumber = new Scanner(System.in);
			long number = firstNumber.nextLong();

			System.out.println("Digit the second number: ");

			secondNumber = new Scanner(System.in);
			long multiple = secondNumber.nextLong();

			isMultiple = multiples.isMultiple(multiple, number);

			System.out.println("The number " + number + " is " + isMultiple + " of " + multiple);
		} catch (ArithmeticException | InputMismatchException exception) {
			System.err.println("!! Ouch !! an error occurred, check your input and try again \n");
		}
	}

	public void optionEvenOrOdd(String option) {
		try {
			multiples = new Multiples();

			System.out.println("------Is " + option + "------");
			System.out.println("Please digit a number to know is " + option + " or not \n");
			System.out.println("Digit the number: ");

			number = new Scanner(System.in);
			long convertedNumber = number.nextLong();

			if (option.equals("even")) {
				result = multiples.isEven(convertedNumber);
			} else {
				result = multiples.isOdd(convertedNumber);
			}

			System.out.println("The number is " + result);
			
		} catch (ArithmeticException | InputMismatchException exception) {
			System.err.println("!! Ouch !! an error occurred, check your input and try again \n");
		}
	}
}

package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.Maximum;

public class MaximumNumberOption {

	private Maximum maximum;
	private Scanner firstNumber;
	private Scanner secondNumber;
	private Scanner thirdNumber;
	private long result;

	public void optionMaximum() {
		try {
			maximum = new Maximum();

			System.out.println("------ Maximum Number ------");
			System.out.println("Please, digit three numbers to know the maximum number \n");
			
			System.out.println("Digit the first number: ");

			firstNumber = new Scanner(System.in);
			long first = firstNumber.nextLong();

			System.out.println("Digit the second number: ");

			secondNumber = new Scanner(System.in);
			long second = secondNumber.nextLong();

			System.out.println("Digit the third number: ");

			thirdNumber = new Scanner(System.in);
			long third = thirdNumber.nextLong();

			result = maximum.getMaximumNumber(first, second, third);

			System.out.println("The maximum number is " + result);

		} catch (InputMismatchException imex) {
			System.err.println("!! Ouch !! Please digit a valid number...\n");
		}
	}
}

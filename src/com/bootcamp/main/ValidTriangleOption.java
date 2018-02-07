package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.ValidTriangle;

public class ValidTriangleOption {
	
	private ValidTriangle validTriangle;
	private Scanner firstNumber;
	private Scanner secondNumber;
	private Scanner thirdNumber;
	private String result;

	public void optionValidTriangle() {
		try {
			validTriangle = new ValidTriangle();

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

			result = validTriangle.isValidTriangle(first, second, third);

			System.out.println(result);

		} catch (InputMismatchException imex) {
			System.err.println("!! Ouch !! Please digit a valid number...\n");
		}
	}
}

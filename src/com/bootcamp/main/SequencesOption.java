package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.Sequences;

public class SequencesOption {

	private Sequences sequences;
	private Scanner number;
	private double result;

	public void optionSequences(int option) {
		try {
			sequences = new Sequences();

			System.out.println("------Sum Sequence " + option + "------");
			if(option == 1){
				System.out.println("Please, digit a number to sum the sequence of n(number)");
				System.out.println("1 + 1/2 + 1/3 + ... + 1/n");
			}else {
				System.out.println("Please, digit a number to sum the first n terms of the sequence ");
				System.out.println("1 + 3/2 + 5/4 + 7/8 ...");
			}

			System.out.println("Digit the number: ");

			number = new Scanner(System.in);
			long convertedNumber = number.nextLong();

			if (option == 1) {
				result = sequences.sumFirstSequence(convertedNumber);
			} else {
				result = sequences.sumSecondSequence(convertedNumber);
			}

			System.out.println("The sum of the sequence is " + result);
			
		} catch (ArithmeticException | InputMismatchException exception) {
			System.err.println("!! Ouch !! an error occurred, check your input and try again \n");
		}
	}
}

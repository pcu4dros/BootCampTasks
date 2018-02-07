package com.bootcamp.main;

import java.util.Scanner;

public class MainMenu {
	
	private static Scanner option;
	
	int menu() {

		int selection;
		option = new Scanner(System.in);

		/***************************************************/

		System.out.println("Please select an option");
		System.out.println("-------------------------\n");
		System.out.println("1 - Is Multiple");
		System.out.println("2 - Is Even");
		System.out.println("3 - Is Odd");
		System.out.println("4 - Leap Year");
		System.out.println("5 - Maximum Number of three");
		System.out.println("6 - Sequence I");
		System.out.println("7 - Sequence II");
		System.out.println("8 - Last Digit");
		System.out.println("9 - Truncate");
		System.out.println("10 - Reverse Number");
		System.out.println("11 - Valid Triangle");
		System.out.println("12 - Dancing Phrases");
		System.out.println("13 - Quit");

		selection = option.nextInt();

		return selection;
	}

	int promptContinue() {
		String selection;
		option = new Scanner(System.in);

		System.out.println("Continue (y/n)? ");

		selection = option.next();

		if (selection.toLowerCase().equals("n")) {
			System.out.println("Bye Bye !!");
			return 13;
		} else if (selection.toLowerCase().equals("y")) {
			return 0;
		} else {
			System.out.println("Option incorrect...!!");
			promptContinue();
		}
		return 0;
	}

}

/**
* The BootCamp program implements an application to show a menu
* of multiple options of sub-applications
*
* @author  pcu4dros
* @version 1.0
* @since   2018-01-14 
*/

package com.bootcamp.main;

import java.util.InputMismatchException;

public class Principal {

	private static MainMenu mainMenu;
	private static MultiplesOption multiples;
	private static LeapYearOption leapYear;
	private static MaximumNumberOption maximum;
	private static SequencesOption sequences;
	private static LastDigitOption lastDigit;
	private static TruncateOption truncate;
	private static ReverseNumberOption reverse;
	private static ValidTriangleOption validTriangle;
	private static DancingPhrasesOption dancingPhrase;

	private static int userChoice = 0;

	public static void main(String[] args){
		try {
			mainMenu = new MainMenu();

			while (userChoice != 13) {

				userChoice = mainMenu.menu();

				switch (userChoice) {

				case 1:
					multiples = new MultiplesOption();
					multiples.optionIsMultiple();
					userChoice = mainMenu.promptContinue();
					break;
				case 2:
					multiples = new MultiplesOption();
					multiples.optionEvenOrOdd("even");
					userChoice = mainMenu.promptContinue();
					break;
				case 3:
					multiples = new MultiplesOption();
					multiples.optionEvenOrOdd("odd");
					userChoice = mainMenu.promptContinue();
					break;
				case 4:
					leapYear = new LeapYearOption();
					leapYear.optionLeapYear();
					userChoice = mainMenu.promptContinue();
					break;
				case 5:
					maximum = new MaximumNumberOption();
					maximum.optionMaximum();
					userChoice = mainMenu.promptContinue();
					break;
				case 6:
					sequences = new SequencesOption();
					sequences.optionSequences(1);
					userChoice = mainMenu.promptContinue();
					break;
				case 7:
					sequences = new SequencesOption();
					sequences.optionSequences(2);
					userChoice = mainMenu.promptContinue();
					break;
				case 8:
					lastDigit = new LastDigitOption();
					lastDigit.optionLastDigit();
					userChoice = mainMenu.promptContinue();
					break;
				case 9:
					truncate = new TruncateOption();
					truncate.optionTruncate();
					userChoice = mainMenu.promptContinue();
					break;
				case 10:
					reverse = new ReverseNumberOption();
					reverse.optionReverse();
					userChoice = mainMenu.promptContinue();
					break;
				case 11:
					validTriangle = new ValidTriangleOption();
					validTriangle.optionValidTriangle();
					userChoice = mainMenu.promptContinue();
					break;
				case 12:
					dancingPhrase = new DancingPhrasesOption();
					dancingPhrase.optionDancingPhrase();
					userChoice = mainMenu.promptContinue();
					break;
				default:
					if (userChoice > 13 || userChoice < 0) {
						System.out.println("The option was invalid!");
					} else {
						System.out.println("Bye Bye");
					}
				}
			}
		} catch (InputMismatchException exception) {
			System.err.println("!! Write a valid option !!");
			main(args);
		}
	}

}

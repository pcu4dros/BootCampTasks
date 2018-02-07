package com.bootcamp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcamp.DancingPhraseConverter;

public class DancingPhrasesOption {
	
	private DancingPhraseConverter dancingPhraseConverter;
	private Scanner phrase;
	private String result;

	public void optionDancingPhrase(){
		try {
			dancingPhraseConverter = new DancingPhraseConverter();

			System.out.println("------Is Leap Year------");
			System.out.println("Please, write a phrase to transform into Dancing Phrase");

			phrase = new Scanner(System.in);

			result = dancingPhraseConverter.getDancingPhrase(phrase.nextLine());
			
			System.out.println(result);

		} catch (InputMismatchException imex) {
			System.err.println("!! Ouch !! Please digit a valid phrase...\n");
		}
	}
}

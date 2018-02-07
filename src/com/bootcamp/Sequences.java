package com.bootcamp;

import com.bootcamp.interfaces.FirstSequence;
import com.bootcamp.interfaces.SecondSequence;

public class Sequences implements FirstSequence, SecondSequence {

	@Override
	public double sumSecondSequence(long number) {
		double sum = 1;
		double numerator = 3;
		double denominator = 2;
		
		for(int i=1; i < number; i++){
			sum += numerator/denominator;
			numerator += 2;
			denominator *= 2;
		}
		
		return sum;
	}

	@Override
	public double sumFirstSequence(long number) {
		double sum = 1;
		double denominator = 2;
		
		for(int i=1; i < number; i++){
			sum += 1/denominator;
			denominator +=1;
		}
		
		return sum;
	}
	

}

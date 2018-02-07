package com.bootcamp;

import com.bootcamp.interfaces.ReversedNumber;

public class ReverseNumber implements ReversedNumber {

	@Override
	public long getReverseNumber(long number) {
		long reverseNumber = 0;
		long module = 0;
		
		while(number != 0){
			module = number % 10;
			reverseNumber = (reverseNumber * 10) + module;
			number /= 10;
		}
		return reverseNumber;
	}

}

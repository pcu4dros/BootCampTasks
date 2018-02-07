package com.bootcamp;

import com.bootcamp.interfaces.LastDigit;

public class LastDigitOfNumber implements LastDigit {

	@Override
	public long getLastDigit(long number) {
		String convertedValue = String.valueOf(number);

		char lastDigit = convertedValue.charAt(convertedValue.length() - 1);
		number = Character.getNumericValue(lastDigit);		
	
		return number;
	}

}

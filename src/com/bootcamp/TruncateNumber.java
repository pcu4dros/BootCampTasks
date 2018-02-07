package com.bootcamp;

import com.bootcamp.interfaces.TruncatedNumber;

public class TruncateNumber implements TruncatedNumber {

	@Override
	public long getTruncatedNumber(long number) {
		String convertedValue = String.valueOf(number);
		if(convertedValue.length() > 1){
			String truncatedNumber = convertedValue.substring(0, 
									 convertedValue.length() - 1);
			number = Long.parseLong(truncatedNumber);	
		}
		
		return number;
	}

}

package com.bootcamp;

import com.bootcamp.interfaces.MaxNumber;

public class Maximum implements MaxNumber {

	@Override
	public long getMaximumNumber(long... numbers) {
		int index = 0;
		long maxNumber = numbers[index];
		
		for(long number : numbers ) {
			if(number > maxNumber){
				maxNumber = number;
			}
		}
		return maxNumber;
	}

}

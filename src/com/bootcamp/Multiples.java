package com.bootcamp;

import com.bootcamp.interfaces.Even;
import com.bootcamp.interfaces.Multiple;
import com.bootcamp.interfaces.Odd;

public class Multiples implements Multiple, Odd, Even {

	@Override
	public String isEven(long number) {
		long validateEven = number & 1;
		if (validateEven == 0) {
			return "even";
		}
		return "not even";
	}

	@Override
	public String isOdd(long number) {
		long validateOdd = number & 1;
		if (validateOdd == 1) {
			return "odd";
		}
		return "not odd";
	}

	@Override
	public String isMultiple(long multiple, long number) {
		long validateMultiple = number % multiple;
		if (validateMultiple == 0) {
			return "multiple";
		}
		return "not multiple";
	}

}

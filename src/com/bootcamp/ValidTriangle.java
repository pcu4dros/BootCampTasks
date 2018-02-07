package com.bootcamp;

import com.bootcamp.interfaces.ValidateTriangle;

public class ValidTriangle implements ValidateTriangle {

	private Maximum maximum;

	@Override
	public String isValidTriangle(long firstLength, long secondLength, long thirdLength) {
		maximum = new Maximum();
		long sumLenghts = 0;
		long maxLength = maximum.getMaximumNumber(firstLength, secondLength, thirdLength);
		if (firstLength == maxLength) {
			sumLenghts = secondLength + thirdLength;
		}

		if (secondLength == maxLength) {
			sumLenghts = firstLength + thirdLength;
		}

		if (thirdLength == maxLength) {
			sumLenghts = firstLength + secondLength;
		}

		if (sumLenghts > maxLength) {
			return "valid triangle";
		}

		return "not valid";
	}

}

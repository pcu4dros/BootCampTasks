package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.LastDigitOfNumber;

public class LastDigitTest {

	private LastDigitOfNumber lastDigitOfNumber;
	
	@Before
	public void setUp() throws Exception {
		lastDigitOfNumber = new LastDigitOfNumber();
	}

	@Test
	public void testLastDigit() {
		long result = 5;
		
		assertEquals(result, lastDigitOfNumber.getLastDigit(155));
		
		result = 0;
		
		assertEquals(result, lastDigitOfNumber.getLastDigit(1010110010));
	}

}

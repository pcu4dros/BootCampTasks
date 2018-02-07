package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.ReverseNumber;

public class ReverseNumberTest {

	private ReverseNumber reverseNumber;
	
	@Before
	public void setUp() throws Exception {
		reverseNumber =  new ReverseNumber();
	}

	@Test
	public void testReverseNumber() {
		long result = 54321;
		
		assertEquals(result, reverseNumber.getReverseNumber(12345));
		
		
	}

}

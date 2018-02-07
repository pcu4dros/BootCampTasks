package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.Maximum;

public class MaximumNumberTest {
	
	private Maximum maximumNumber;

	@Before
	public void setUp() throws Exception {
		maximumNumber = new Maximum();
	}

	@Test
	public void testMaximumNumber() {
		long result = 50;
		
		assertEquals(result, maximumNumber.getMaximumNumber(10,30,50));
		
		result = 5000;
		
		assertEquals(result, maximumNumber.getMaximumNumber(5000,1200,4000));
		
		result = 10;
		
		assertEquals(result, maximumNumber.getMaximumNumber(10,5,5));

	}

}

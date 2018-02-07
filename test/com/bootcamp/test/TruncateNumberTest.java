package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.TruncateNumber;

public class TruncateNumberTest {
	
	private TruncateNumber truncateNumber;

	@Before
	public void setUp() throws Exception {
		truncateNumber = new TruncateNumber();
	}

	@Test
	public void testTruncatedNumber() {
		long result = 25;
		
		assertEquals(result, truncateNumber.getTruncatedNumber(255));
		
		result = 2;
		
		assertEquals(result, truncateNumber.getTruncatedNumber(2));
	}

}

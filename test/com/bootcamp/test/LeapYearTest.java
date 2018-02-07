package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.LeapYearOrNot;

public class LeapYearTest {

	private LeapYearOrNot leapYearOrNot;
	
	@Before
	public void setUp() throws Exception {
		leapYearOrNot = new LeapYearOrNot();
	}

	@Test
	public void testLeapYear() {
		String result = "Leap Year";
		
		assertEquals(result, leapYearOrNot.isLeapYear(1904));
		assertEquals(result, leapYearOrNot.isLeapYear(1960));
		assertEquals(result, leapYearOrNot.isLeapYear(1980));

	}

}

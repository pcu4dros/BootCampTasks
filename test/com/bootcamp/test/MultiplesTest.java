package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.Multiples;


public class MultiplesTest {
	
	private Multiples multiplesTest;

	@Before
	public void setUp() throws Exception {
		multiplesTest = new Multiples();
	}

	@Test
	public void testEven() {
		String result = "even";
	    assertEquals(result, multiplesTest.isEven(2));
	    assertEquals(result, multiplesTest.isEven(200));
	    assertEquals(result, multiplesTest.isEven(40));
	       
	}

	@Test
	public void testOdd() {
		String result = "odd";
	    assertEquals(result, multiplesTest.isOdd(3));	
	    assertEquals(result, multiplesTest.isOdd(7));	
	    assertEquals(result, multiplesTest.isOdd(1));	
	    
	}

	@Test
	public void testMultiple() {
		String result = "multiple";
	    assertEquals(result, multiplesTest.isMultiple(1,2));
	    assertEquals(result, multiplesTest.isMultiple(5,25));
	    assertEquals(result, multiplesTest.isMultiple(4,36));	
	}

}

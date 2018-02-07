package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.ValidTriangle;

public class ValidTriangleTest {
	
	private ValidTriangle validTriangle;

	@Before
	public void setUp() throws Exception {
		validTriangle = new ValidTriangle();
	}

	@Test
	public void testValidTriangle() {
		String result = "valid triangle";
		
		assertEquals(result, validTriangle.isValidTriangle(4,5,8));
		assertEquals(result, validTriangle.isValidTriangle(3,4,5));
		assertEquals(result, validTriangle.isValidTriangle(4,5,3));
		assertEquals(result, validTriangle.isValidTriangle(10,5,7));
	}

}

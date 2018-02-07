package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.Sequences;

public class SequencesTest {
	
	private Sequences sequences;
	private static final double DELTA = 1e-15;

	@Before
	public void setUp() throws Exception {
		sequences = new Sequences();
	}

	@Test
	public void testSumSecondSequence() {
		double result = 2.5;
		assertEquals(result, sequences.sumSecondSequence(2), DELTA);
		
		result = 3.75;
		assertEquals(result, sequences.sumSecondSequence(3), DELTA);
		
		result = 1.0;
		assertEquals(result, sequences.sumFirstSequence(0), DELTA);
		
		result = 1.0;
		assertEquals(result, sequences.sumFirstSequence(-1), DELTA);
	}

	@Test
	public void testSumFirstSequence() {
		double result = 1.5;
		assertEquals(result, sequences.sumFirstSequence(2), DELTA);
		
		result = 1.8333333333333333;
		assertEquals(result, sequences.sumFirstSequence(3), DELTA);

		result = 1.0;
		assertEquals(result, sequences.sumFirstSequence(0), DELTA);
		
		result = 1.0;
		assertEquals(result, sequences.sumFirstSequence(-1), DELTA);
	}

}

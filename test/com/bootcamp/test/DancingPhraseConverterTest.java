package com.bootcamp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.DancingPhraseConverter;

public class DancingPhraseConverterTest {
	
	private DancingPhraseConverter dancingPhrase;

	@Before
	public void setUp() throws Exception {
		dancingPhrase = new DancingPhraseConverter();
	}

	@Test
	public void testGetDancingPhrase() {
		String result = "El Verdadero Hombre Araña";
		
		String normalPhrase = "el verdadero hombre araña";
		
		assertEquals(result, dancingPhrase.getDancingPhrase(normalPhrase));
	}

}

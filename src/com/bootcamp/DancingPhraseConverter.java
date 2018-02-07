package com.bootcamp;

import com.bootcamp.interfaces.DancingPhrase;

public class DancingPhraseConverter implements DancingPhrase {

	@Override
	public String getDancingPhrase(String phrase) {
		StringBuilder dancingPhrase = new StringBuilder();
	    boolean validateCharacter = true;

	    for (char character : phrase.toCharArray()) {
	        if (Character.isSpaceChar(character)) {
	        	validateCharacter = true;
	        } else if (validateCharacter) {
	        	character = Character.toUpperCase(character);
	        	validateCharacter = false;
	        }
	        dancingPhrase.append(character);
	    }
	    
	    return dancingPhrase.toString();
	}

}

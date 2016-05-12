package fr.imie.asciiart.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;

import fr.imie.asciiart.main.core.Character;
import fr.imie.asciiart.main.core.Sentence;
import junit.*;

public class TestAsciiArt {

	
	public void createAlphabet() {
		Character a = new Character();
		a.setHeight(10);
		a.setWidth(10);;
		a.setAsciiConversion([][]);
	}
	
	public TestAsciiArt() {
	}

	public boolean testWidth(int width) {

		boolean result = false;
		
		fr.imie.asciiart.main.core.Character char1 = new fr.imie.asciiart.main.core.Character();
		char1.setWidth(width);
		
	}

}

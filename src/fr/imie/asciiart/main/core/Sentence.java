package fr.imie.asciiart.main.core;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Character> characaters;

	public Sentence() {
		// TODO Auto-generated constructor stub

		this.characaters = new ArrayList<Character>();
	}

	public List<Character> getCharacaters() {
		return characaters;
	}

	public void setCharacaters(List<Character> characaters) {
		this.characaters = characaters;
	}
	
	public void addCharacter(Character character) {
		this.characaters.add(character);
	}
	
	public void removeCharacter(Character character) {
		this.characaters.remove(character);
	}
}
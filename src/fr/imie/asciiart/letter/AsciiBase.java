package fr.imie.asciiart.letter;

import java.util.ArrayList;

public class AsciiBase {
	
	
	protected char name;
	protected static int height;
    protected static int width;
    protected ArrayList<String> letter1;
    protected ArrayList<String> letter2;
    
    
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int height) {
		AsciiBase.height = height;
	}
	public static int getWidth() {
		return width;
	}
	public static void setWidth(int width) {
		AsciiBase.width = width;
	}
	public ArrayList<String> getLetter1() {
		return letter1;
	}
	public void setLetter1(ArrayList<String> letter1) {
		this.letter1 = letter1;
	}
	public ArrayList<String> getLetter2() {
		return letter2;
	}
	public void setLetter2(ArrayList<String> letter2) {
		this.letter2 = letter2;
	}
	
	

}

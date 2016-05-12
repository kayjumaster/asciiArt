package fr.imie.asciiart.main.core;

public class Character {

	private int width;
	private int height;
	private String asciiConversion [][];
	


	public Character() {
		// TODO Auto-generated constructor stub
	}
	
	public Character(int width, int height, int characters) {
		
		this.height = height;
		this.width = width;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String[][] getAsciiConversion() {
		return asciiConversion;
	}

	public void setAsciiConversion(String[][] asciiConversion) {
		this.asciiConversion = asciiConversion;
	}


}

package fr.imie.asciiart.gameprocess;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	int height;
	int width;
	int numbChar;

	String text;

	Scanner scan;

	ArrayList<String> asciiTab = new ArrayList<String>();

	public User() {

		// On récupere la saisie du user
		scan = new Scanner(System.in);
		width = scan.nextInt();

		scan.nextLine();

		height = scan.nextInt();
		scan.nextLine();

		text = scan.nextLine().toUpperCase();

		// Ajout dans le tableau
		for (int i = 0; i < height; i++) {
			asciiTab.add(scan.nextLine());
		}
	}

	
	
	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	
	public int getNumbChar() {
		return numbChar;
	}

	public void setNumbChar(int numbChar) {
		this.numbChar = numbChar;
	}

	
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	
	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	
	
	public ArrayList<String> getAsciiTab() {
		return asciiTab;
	}

	public void setAsciiTab(ArrayList<String> asciiTab) {
		this.asciiTab = asciiTab;
	}

}

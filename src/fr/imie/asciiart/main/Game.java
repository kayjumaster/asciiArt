package fr.imie.asciiart.main;

import java.util.ArrayList;

import fr.imie.asciiart.letter.AsciiBase;
import fr.imie.asciiart.letter.AsciiDefault;

public class Game {

	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	static ArrayList<String> Tab = new ArrayList<>();

	/**
	 * Get witdh(4) and height(5)
	 */
	public static void getLetter1() {

		AsciiBase.setWidth(4);
		AsciiBase.setHeight(5);
	}

	/**
	 * Get witdh(7) and height(10)
	 */
	public static void getLetter2() {

		AsciiBase.setWidth(7);
		AsciiBase.setHeight(10);
	}
/**
 * Return letter or word on Ascii
 * @param text
 */
	public static void asciiArt(String text) {

		AsciiBase str;

		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for (char c : text.toCharArray()) {
			if (c < 'A' || c > 'Z') {
				str = new AsciiDefault();
			} else {
				str = (AsciiBase) Class.forName("fr.imie.asciiart.letter.Ascii" + c).newInstance();
				// Method no complet
			}
		}

		// Result display
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < indexes.size(); j++) {
				System.out.print(asciiTab.get(i).substring(indexes.get(j) * width, indexes.get(j) * width + width));
			}
			System.out.println();
		}
	}
}

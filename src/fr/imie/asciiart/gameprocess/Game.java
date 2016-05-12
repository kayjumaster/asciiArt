package fr.imie.asciiart.gameprocess;

import java.util.ArrayList;


public class Game extends User {


	static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

	public Game(int height, int width, int numbChar) {



		// find the necessary indexes of letters
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for (char c : text.toCharArray()) {
			if (c < 'A' || c > 'Z')
				indexes.add(26);
			else {
				for (char letter : letters.toCharArray()) {
					if (c == letter) {
						indexes.add(letters.indexOf(letter));
					}
				}
			}
		}

		// print result
		for (int j = 0; j < height; j++) {
			for (int k = 0; k < indexes.size(); k++) {
				System.out.print(asciiTab.get(j).substring(indexes.get(k) * width, indexes.get(k) * width + width));
			}
			System.out.println();
		}
		scan.close();
	}
}

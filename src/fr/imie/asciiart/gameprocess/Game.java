package fr.imie.asciiart.gameprocess;
import java.util.ArrayList;

public class Game extends User {


	static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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

		// Affichage du r�sultat
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < indexes.size(); j++) {
				System.out.print(asciiTab.get(i).substring(indexes.get(j) * width, indexes.get(j) * width + width));
			}
			System.out.println();
		}
		scan.close();
	}
}
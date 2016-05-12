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
		
		for (int i = 0; i < height; i++) {
			asciiTab.add(scan.nextLine());
		}
	}

}

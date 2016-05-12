package fr.imie.asciiart.gameprocess;

import java.util.*;

public class User {

	int height;
	int width;
	int numbChar;
	String text;
	Scanner scan;
	ArrayList<String> asciiTab = new ArrayList<String>();

	public User() {

// Getting the user scanner
  		scan = new Scanner(System.in);
  		System.out.println("Veuillez entrer votre texte à traduire en ASCII: ");
  		width = scan.nextInt();

  		scan.nextLine();
    	height = scan.nextInt();
    	scan.nextLine();
  		text = scan.nextLine().toUpperCase();
  		
  		System.out.println(text);
		
// Adding in the array
  		for (int i = 0; i < height; i++) {
  			asciiTab.add(scan.nextLine());
  		}
	}	
		
	public static void main(String[] args) {	
		User user = new User();
		System.out.println(user.text);
//		System.out.println(user);
	
	}
}

package fr.imie.asciiart.gameprocess;

import java.util.*;

import fr.imie.asciiart.entity.User;

public class AddUserInfo {
	
	public static void main(String[] args){
		
		User user = RecupInfo();
		// System.out.println(user.getHeight());
		
		
	}

	
	public static User RecupInfo() {
		int height;
		int width;
		int numbChar;
		String text;
		Scanner scan;
		
// Getting the user scanner
  		scan = new Scanner(System.in);
  		System.out.println("Veuillez entrer la largeur: ");
  		width = scan.nextInt();

  		System.out.println("Veuillez entrer la hauteur: ");
  		scan.nextLine();
    	height = scan.nextInt();
    	System.out.println("Veuillez entrer la lettre ou la phrase: ");
    	scan.nextLine();
  		text = scan.nextLine().toUpperCase();
  		
  	//	System.out.println("Votre texte :" + text);
  	//	System.out.println("Votre hauteur : " + height);
  	//	System.out.println("Votre largeur :" + width);
// Adding in the array
  		User user = new User();
  		user.setHeight(height);
  		user.setWidth(width);
  		user.setText(text);
  		
  		return user;
  		//System.out.println(user.getHeight());
  		
	}	
}

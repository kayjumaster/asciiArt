package fr.imie.asciiart.main;

import java.util.Scanner;

import fr.imie.asciiart.entity.User;
import fr.imie.asciiart.gameprocess.Game;

public class main {
	
	public static void main(String[] args) {
		
		Scanner scan;
		int height;
		int width;
		String text;
		
		
		scan = new Scanner(System.in);
  		System.out.println("Veuillez entrer la largeur: ");
  		width = scan.nextInt();

  		System.out.println("Veuillez entrer la hauteur: ");
  		scan.nextLine();
    	height = scan.nextInt();
    	System.out.println("Veuillez entrer la lettre ou la phrase: ");
    	scan.nextLine();
  		text = scan.nextLine().toUpperCase();
  		
  		User user = new User();
  		user.setHeight(height);
  		user.setWidth(width);
  		user.setText(text);
  			System.out.println("Votre texte :" + text);
  			
  		Game game = new Game();
  		
	}
 
 
	 
 }
 

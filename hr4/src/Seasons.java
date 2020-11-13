package src;

import java.util.Scanner;

/**
 * Translate the English names of the seasons into Spanish
 * @author MehrBarz
 *
 */

public class Seasons {

	public static void main(String[] args) {
		String input;
		
		//Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		
		//Get a season from the user
		System.out.println("Enter the name of the season: ");
		input = keyboard.nextLine();
		
		// Translate the season to Spanish
		switch(input)
		{
		case "spring":
			System.out.println("la primavera");
			break;
		case "summer":
			System.out.println("el verano");
			break;
		case "autumn":
		case "fall":
			System.out.println("el otono");
			break;
		case "winter":
			System.out.println("el invierno");
			break;
			default:
				System.out.println("Please enter one of these words: \n Spring , summer , autumn , fall or winter. ");
		}

	}

}

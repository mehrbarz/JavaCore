package src;

import java.util.Scanner;

/**
 * case insensitive string comparison
 * @author MehrBarz
 *
 */

public class SecretWord {

	public static void main(String[] args) {
		String input;   // To hold the input
		
		// Create a scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the secret word
		System.out.println("Please enter the secret word: ");
		input = keyboard.nextLine();
		
		//Determine whether the user entered the secret word
		if(input.equalsIgnoreCase("KYOTO"))
		{
			System.out.println("You entered the secret word! ");
		}
		else
		{
			System.out.println("That is not the secret word.");
		}
		

	}

}

package src;

import java.util.Scanner;

/**
 * demonstrating a "user controlled for loop"
 * @author MehrBarz
 *
 */
public class UserSquares {

	public static void main(String[] args) {
		
		int number ; // Loop control variable
		int maxValue; // Maximum value to display
		
		System.out.println("I will display a table of numbers and their squares. ");
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		
		// Get the maximum value to display
		System.out.println("How high should I go? ");
		maxValue = keyboard.nextInt();
		
		// Display the table
		System.out.println("Numer--------Number sqaured");
		System.out.println("----------------------------");
		for (number = 0; number <= maxValue; number++) {
			{
				System.out.println(number + "\t\t" + number * number);
			}
		}
		
	}

}

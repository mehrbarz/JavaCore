package src;

import java.util.Scanner;

/**
 * This program demonstrates a user controlled loop.
 * @author MehrBarz
 *
 */

public class TestAverage01 {

	public static void main(String[] args) {
		
		int score1, score2 , score3; // 3 test scores
		double average;      // Average test score
		char repeat;       // To hold 'Y' or 'N'
		String input;      // To hold input

		System.out.println("Calculating the average of three test scores. ");
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		
		// Get as many sets of test scores as the user wants 
		do 
		{
			// Get the first test score in this set. 
			System.out.println("Enter score #1: ");
			score1 = keyboard.nextInt();
			
			// Get the second test score in this set. 
			System.out.println("Enter score #2: ");
			score2 = keyboard.nextInt();
			
			// Get the third test score in this set.
			System.out.println("Enter score #3: ");
			score3 = keyboard.nextInt();
			
			// consume the remaining newline
			keyboard.nextLine();
			
			// Calculate and print the average test score. 
			average = (score1+ score2 + score3)/3.0 ; 
			System.out.println("The average is " + average);
			System.out.println();  // print a blank line
			
			
			// Does the user want to average another set? 
			System.out.println("Would you like to average another set of test scores? ");
			System.out.println(" Enter Y for yes or N for no: ");
			input = keyboard.nextLine();   // read a line
			repeat = input.charAt(0);   // Get the first char
			
		}while (repeat == 'Y' || repeat == 'y');
	}

}

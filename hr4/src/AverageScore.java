package src;

import java.util.Scanner;

/**
 * if statement
 * @author MehrBarz
 *
 */

public class AverageScore {

	public static void main(String[] args) {
		
		double score1, 
		       score2,
		       score3,
		       average;
		
		// Create a Scanner object to read input. 
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This program averages 3 test scores. ");
		
		// Get the first score.
		System.out.println("Enter score #1: ");
		score1 = keyboard.nextDouble();
		
		// Get the second score.
		System.out.println("Enter score #2: ");
		score2 = keyboard.nextDouble();
		
		// Get the third score. 
		System.out.println("Enter score #3: ");
		score3 = keyboard.nextDouble();
		
		// Calculate and display the average score. 
		average = (score1 + score2 + score3)/ 3.0;
		System.out.println("The average is " + average);
		
		//If the average is higher than 90, congratulate the user.
		if(average > 90)
			System.out.println("You made a great score! ");
		

				
	}

}

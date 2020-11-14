package src;

import java.util.Scanner;

/**
 * Calculating the total number of points a soccer team has entered 
 * over a series of games. The user enters a series of point values, then -1 
 * when finished. 
 * @author MehrBarz
 *
 */

public class SoccerPoints {

	public static void main(String[] args) {
		int points; // Game points
		int totalPoints = 0; // Accumulator initiated to 0
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		
		// Display general instructions
		System.out.println("Enter the number of points your team has earned for each game this season. \n"
				+ "Enter -1 when finished.");
        System.out.println("");
	
        // Get the first number of points
        System.out.println("Enter games points or -1 to end: ");
        points = keyboard.nextInt();
        
        // Accumulate the points until -1 is entered
        while (points != -1)
        {
        	// Add points to totalPoints
        	totalPoints += points ; 
        	
        	// Get the next number of points
        	System.out.println("Enter game points or -1 to end : ");
        	points = keyboard.nextInt();
        	
        	
        }
        
        // Display the total number of points
        System.out.println("The total number of points are " + totalPoints);
	}
	

}

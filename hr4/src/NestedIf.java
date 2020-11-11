package src;

import java.util.Scanner;

/**
 * Nested if statement
 * @author MehrBarz
 *
 */

public class NestedIf {

	public static void main(String[] args) {
		
		double salary; //Annual salary
		double yearsOnJob; // Years at current job
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the user's annual salary.
		System.out.println("Enter your annual salary: ");
		salary = keyboard.nextDouble();
		
		// Get the number of years on the current job.
		System.out.println("Enter the number of years on the current job: ");
		yearsOnJob = keyboard.nextDouble();
		
		// Determine whether the user qualifies for the loan. 
		if(salary >= 50000) {
			if(yearsOnJob >= 2) {
				System.out.println("You qualify for the loan. ");
			} else 
			{
				System.out.println("You must have been on your current job for at least two years to qualify. ");
			}
		}
		else 
		{
			System.out.println("You must earn at least $50,000 per year to qualify ");
		}

	}

}

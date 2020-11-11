package src;

import java.util.Scanner;

/**
 * This program demonstrates the logical && operator. 
 * @author MehrBarz
 *
 */
public class LogicalAnd {

	public static void main(String[] args) {
		double salary; // Annual salary
		double yearsOnJob; // Years at current job
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Get the user's annual salary.
		System.out.println("Enter your annual salary: ");
		salary = keyboard.nextDouble();
		
		// Get the number of years at the current job.
		System.out.println("Enter the number of years at the current job : ");
		yearsOnJob = keyboard.nextDouble();
		
		// Determine whether the user qualifies for the loan.
		if(salary >= 50000 && yearsOnJob >=2 ) 
		{
			System.out.println("You qualify for the loan. ");
		}
		else 
		{
			System.out.println("You do not qualify. ");
		}

	}

}

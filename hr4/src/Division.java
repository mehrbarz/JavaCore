package src;

import java.util.Scanner;

/**
 * if-else
 * @author MehrBarz
 *
 */

public class Division {

	public static void main(String[] args) {
		
		double number1 , number2 ; // Division operands
		double quotient;  // Result of division
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the first number. 
		System.out.println("Enter the first number: ");
		number1 = keyboard.nextDouble();
		
		// Get the second number. 
		System.out.println("Enter the second number: ");
		number2 = keyboard.nextDouble();	
		
		if (number2 == 0 ) 
		{
			System.out.println("Division by zero is not possible. ");
			System.out.println("Please run the program again and enter a number other than zero");
		} else
		{
			quotient = number1 / number2 ;
			System.out.println("The quotient of " + number1 +" divided by " + number2 +  " is " + quotient);
		}
	}

}

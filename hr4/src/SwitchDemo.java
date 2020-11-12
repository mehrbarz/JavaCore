package src;

import java.util.Scanner;

/**
 * demonstrating the switch statement
 * @author MehrBarz
 *
 */

public class SwitchDemo {

	public static void main(String[] args) {
		
		int number ; // A number entered by the user
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Get one of the numbers 1 - 3 
		System.out.println("Please enter 1 , 2 or 3 : ");
		number = keyboard.nextInt();
		
		//Determine the number entered
		switch (number)
		{
		case 1:
			System.out.println("you entered 1 ");
			break;
			
		case 2:
			System.out.println("you entered 2 ");
			break;
		case 3:
			System.out.println("you entered 3 ");
			break;
		default:
			System.out.println("The number is not 1 - 3 ");
			
		}

	}

}

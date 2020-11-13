package src;

import java.util.Scanner;

/**
 * switch statement
 * @author MehrBarz
 *
 */

public class PetFood {

	public static void main(String[] args) {
		String input;   // To hold a user's input
		char foodGrade;  // Grade of pet food
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Our pet food is available in three grades , A , B , C : choose a grade : ");
		input = keyboard.nextLine();
		foodGrade = input.charAt(0);
		
		// Display pricing for the selected grade. 
		switch(foodGrade) 
		{
		
		   case 'a':
		   case 'A':
			   System.out.println(" 30 crowns per kg. ");
			   break;
			   
		   case 'b':
		   case 'B':
			   System.out.println(" 60 crowns per kg. ");
			   break;
		   case 'c':
		   case 'C':
			   System.out.println("90 crowns per kg. ");
			   break;
			default:
				System.out.println("Invalid choice. ");
			
		   
			
		}

	}

}

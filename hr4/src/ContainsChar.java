package src;

import java.util.Scanner;

public class ContainsChar {

	public static void main(String[] args) {
		

		String myCharacter; 
		
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Please enter a character : ");
		myCharacter = keyboard.nextLine();
		
		if(myCharacter.contains("D"))
			System.out.println("Good ");
								
	}

}

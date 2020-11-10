package hr4;

import java.util.Scanner;

public class InputProblem {

	public static void main(String[] args) {
		
		String name;
		int age;
		double income; 
		
		//Create a scanner object to read input.
		Scanner keyboard = new Scanner (System.in);
		
		// Get the user's age.
		System.out.println("What is your age? ");
		age = keyboard.nextInt();
		
		//Get the user's income.
		System.out.println("What is your annual income? ");
		income = keyboard.nextDouble();
		
		//Consume the remaining newline
		keyboard.nextLine();
		
		// Get the user's name.
		System.out.println("What is your name? ");
		name = keyboard.nextLine();
		
		//Display the information back to the user.
		System.out.println("Hello, "+ name + " Your age is " + age + " and your income is $" + income);

	}

}

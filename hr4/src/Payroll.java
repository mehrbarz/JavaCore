package src;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {

		String name;
		int hours;
		double payRate;
		double grossPay;

		// Create a scanner object to read input.
		Scanner keyboard = new Scanner(System.in);

		// Get the user's name.
		System.out.println("What is your name? ");
		name = keyboard.nextLine();

		// GEt the number of hours worked this week.
		System.out.println("How many hours did you work this week? ");
		hours = keyboard.nextInt();

		// Get the user's hourly pay rate.
		System.out.println("What is your hourly pay rate? ");
		payRate = keyboard.nextDouble();

		// Calculate the gross pay.
		grossPay = hours * payRate;

		// Display the resulting information
		System.out.println("Hello, " + name);
		System.out.println("Your gross pay is $" + grossPay);

	}

}

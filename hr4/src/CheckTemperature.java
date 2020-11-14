package src;

import java.util.Scanner;

/**
 * This program assists a technician in the process of checking a substance's temperature.
 * @author MehrBarz
 *
 */

public class CheckTemperature {

	public static void main(String[] args) {
		final double MAX_TEMP = 156.5; //Maximum temperature
		double temperature;      // To hold the temperature
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the current temperature
		System.out.println("Enter the substance's Celcius temperature : ");
		temperature = keyboard.nextDouble();
		
		// As long as necessary, instruct the technician to adjust the temperature
		while (temperature > MAX_TEMP)
		{
			System.out.println("The ermperature is too high, Turn the temperature down and wait 4 mins. \n and enter it here:  ");
			temperature = keyboard.nextDouble();
			
		}
		
		// Remind the technician to check the temperature again in 17 mins.
		System.out.println("The temp is acceptable, check it again in 45 mins");
		

	}

}

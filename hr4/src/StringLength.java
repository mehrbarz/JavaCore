package src;

import java.util.Scanner;

//-------------------------
//   String practices
//   coded by Mehr Barz
//..........................

public class StringLength {

	public static void main(String[] args) {

		String name = "Shobert";
		String capitalName = "GOGAN";
		int stringSize;
		int number;

		String smallName = capitalName.toLowerCase();
		stringSize = name.length();
		System.out.println(name + " has " + stringSize + " character.");
		System.out.println(smallName);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer value: ");
		number = keyboard.nextInt();
		System.out.println("The number you chose is: " + number);

	}

}

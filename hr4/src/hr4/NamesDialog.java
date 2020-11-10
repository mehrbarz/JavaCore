package hr4;

import javax.swing.JOptionPane;

/**
 * This program demonstrates using dialogs with JOptionPane.
 * @author MehrBarz
 *
 */

public class NamesDialog {

	public static void main(String[] args) {
		
		String firstName, lastName;
		
		// Get the user's first name. 
		firstName = JOptionPane.showInputDialog("What is your first name? ");
		
		// Get the user's last name.
		lastName = JOptionPane.showInputDialog("What is your last name? ");
		
		// Display a greeting. 
		JOptionPane.showMessageDialog(null, "Welcome to the real world " + firstName +" " +  lastName);
		
		System.exit(0);

	}

}

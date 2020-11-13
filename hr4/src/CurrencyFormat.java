package src;

import javax.swing.JOptionPane;

/**
 * how to use the string.format method to format a number as currency
 * @author MehrBarz
 *
 */

public class CurrencyFormat {

	public static void main(String[] args) {
		double monthlyPay = 5000.0 ;
		double annualPay = monthlyPay * 12 ;
		String output = String.format("You annual pay is $%,.2f", annualPay);
		
		JOptionPane.showMessageDialog(null, output);

	}

}

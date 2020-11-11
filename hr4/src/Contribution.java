package src;

public class Contribution {

	public static void main(String[] args) {
		// Variables to hold the monthly pay and
		// the amount of contribution
		double monthlyPay = 6000.0;
		double contribution;

		// Calculate and display a 5% contribution.
		contribution = monthlyPay * 0.05;
		System.out.println(Messages.getString("Contribution.0") + contribution + Messages.getString("Contribution.1")); //$NON-NLS-1$ //$NON-NLS-2$

		// calculate and display an 8% contribution.
		contribution = monthlyPay * 0.08;
		System.out.println(Messages.getString("Contribution.2") + contribution + Messages.getString("Contribution.3")); //$NON-NLS-1$ //$NON-NLS-2$

		// calculate and display a 10% contribution.
		contribution = monthlyPay * 0.1;
		System.out.println(Messages.getString("Contribution.4") + contribution + Messages.getString("Contribution.5")); //$NON-NLS-1$ //$NON-NLS-2$

	}

}

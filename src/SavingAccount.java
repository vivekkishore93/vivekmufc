/**
 * 
 */
package factory;

/**
 * @author Avinash
 *
 */
public class SavingAccount extends BankAccount{

	private final double rateOfInterest = 4.0;
	private final double timePeriod = 0.5;
	
	public double calculateInterest(double principle) {
		double interest = (principle * rateOfInterest * timePeriod)/100;
		return interest;
	}

}

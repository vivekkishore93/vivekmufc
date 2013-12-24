/**
 * 
 */
package factory;

/**
 * @author Avinash
 *
 */
public class SweepInAccount extends BankAccount{
	
	private final double rateOfInterest = 8.25;
	private final double timePeriod = 0.5;
	
	public double calculateInterest(double principle) {
		double interest = (principle * rateOfInterest * timePeriod)/100;
		return interest;
	}

}

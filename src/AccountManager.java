/**
 * 
 */
package factory;

import javax.swing.JOptionPane;
/**
 * @author Avinash
 *
 */
public class AccountManager {

	public static void main(String[] args){
		    
		String accType;
		double amount;
		double interest;
		BankAccount baAbstarct = null;
		
		accType = JOptionPane.showInputDialog("Enter the account type");
		amount = Double.parseDouble((JOptionPane.showInputDialog("Enter the amount")));
		
		baAbstarct = AccountFactory.getAccountInstance(accType);
		interest = baAbstarct.calculateInterest(amount);
		
		JOptionPane.showConfirmDialog(null, "Interest is: "+ interest);
		System.exit(0);
	  		
	}
	
	
}

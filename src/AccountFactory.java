/**
 * 
 */
package factory;

/**
 * @author Avinash
 *
 */
public class AccountFactory {

	public static BankAccount getAccountInstance(String accType){
		
		if(accType.equals("current"))
			return new CurrentAccount();
		else if(accType.equals("saving"))
			return new SavingAccount();
		else if(accType.equals("sweep"))
			return new SweepInAccount();
		else
			return null;
	
	}
}

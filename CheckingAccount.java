/* Alaric Medina*/
/* ID: 2527467 */
// set numOfChecks as private integer type
// in CheckingAccount overload method with one parameter
//	call the constructor from the Account superclass using the super keyword
// in CheckingAccount overload method with two parameters
// 	call the constructor from the Account superclass using the super keyword
// in withdraw void method
//	add $3 if numOfChecks is greater than or equal to 3 and withdraw added amount from superclass
//  otherwise withdraw original amount from the superclass
package cop2251.spring25.week1.medina;

public class CheckingAccount extends Account {
	private int numOfChecks;

	// This method calls the constructor with local chaining
	public CheckingAccount(String accountNumber) {
		this(accountNumber, 0);
	}
	// This method calls the superclass constructor with accountNumber and balance as arguments
	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	// This method adds 3 to withdraw if number of checks is greater than or equal to 3
	public void withdraw(double amount) {
		numOfChecks++;
		if (numOfChecks >= 3) {
			double addAmount = amount + 3.0;
			super.withdraw(addAmount);
		} else {
			super.withdraw(amount);
		}
	}

}

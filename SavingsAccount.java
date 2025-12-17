/* Alaric Medina*/
/* ID: 2527467 */
// set minBalance to 100 as private double type
// in SavingsAccount overload method with one parameter
//	call the constructor from the Account superclass using the super keyword
// in SavingsAccount overload method with two parameters
//  call the constructor from the Account superclass using the super keyword
// in addInterest void method
// add the interest from superclass if the balance meets the minimum balance required
package cop2251.spring25.week1.medina;

public class SavingsAccount extends Account {

	private double minBalance = 100;
	
	public SavingsAccount(String accountNumber) {
		// Call the Account constructor with local chaining
		this(accountNumber, 0);
	}

	public SavingsAccount(String accountNumber, double balance) {
		// Call the Account superclass constructor
		super(accountNumber, balance);
	}

	public void addInterest() {
		// This makes sure the balance meets the minimum balance of 100
		if (getBalance() >= minBalance) {
			super.addInterest();
		}
	}

}

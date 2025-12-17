/* Alaric Medina*/
/* ID: 2527467 */
// set balance as private double type
// set accountNumber as private String type
// set interestRate to 0.02 as private double type 
// create constructor to reference accountNumber and balance
// create deposit method to add amount to the balance
// create withdraw method to subtract amount from balance using if/else statement in case input is greater than balance
// create getBalance method to return the balance
// create addInterest method to calculate interest and add the interest to the balance
package cop2251.spring25.week1.medina;

public class Account {
	private double balance;
	private String accountNumber;
	private double interestRate = .02;

	// Reference account number and balance
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Add amount to the balance
	public void deposit(double amount) {
		balance += amount;
	}

	// withdraw amount from the balance if amount
	// is less than or equal to the balance
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.print("Amount is too much");
			
		}

	}

	/** Return balance */
	public double getBalance() {
		return balance;
	}

	// Calculate interest and deposit the interest to the balance
	public void addInterest() {
		double interest = balance * interestRate;
		deposit(interest);
	}
}
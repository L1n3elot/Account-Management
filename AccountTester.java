package cop2251.spring25.week1.medina;

public class AccountTester {
	public static void main(String[] args) {
		
		
		CheckingAccount checking  = new CheckingAccount("123", 100.00);
        checking.withdraw(10.00);
        checking.withdraw(2.00);
        checking.withdraw(2.00);
        System.out.println(checking.getBalance());  // should be 88.00
        
       
        CheckingAccount checking1  = new CheckingAccount("123");
        checking1.withdraw(10.00);
        checking1.withdraw(2.00);
        checking1.addInterest();
        System.out.println(checking1.getBalance());
        
        SavingsAccount savings = new SavingsAccount("123", 100.0);
        System.out.println(savings.getBalance());
        
        SavingsAccount savings1 = new SavingsAccount("123");
        savings1.addInterest();
        System.out.println(savings1.getBalance());
        
        Account account = new Account("123", 100.0);
        account.deposit(5.0);
        account.addInterest();
        System.out.println(account.getBalance());
}
}
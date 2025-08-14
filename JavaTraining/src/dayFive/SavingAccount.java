package dayFive;

public class SavingAccount implements Bank {
	private double balance;
	
	public SavingAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("Insufficient funds to withdraw $" + amount);
		}
	}
	
	public void displayAccountType() {
		System.out.println("Account Type: Saving Account");
	}
}

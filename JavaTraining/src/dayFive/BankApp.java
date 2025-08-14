package dayFive;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank account = new SavingAccount(1000);
        account.displayAccountType();           // default override
        account.executeTransaction("deposit", 500);   // deposit
        account.executeTransaction("withdraw", 200);  // withdraw
        account.executeTransaction("withdraw", -50);  // invalid
        System.out.println("Final Balance: $" + account.getBalance());

	}

}

package dayTwo;

public class BankAccMain {
	public static void main(String[] args) {
		BankAccount b = new BankAccount("Om", 1000);
		b.deposit(2000);
		b.withdraw(500);
		b.displayDetails();
	}
}

package dayThree;

abstract class Payments {
	double amount;
	
	Payments(double amount) {
		this.amount = amount;
	}
	
	abstract void makePayment();
	
	void showSuccessMessage() {
		System.out.println("Payment Successfull" + amount);
	}
}

class CreditCardPayment extends Payments {
	CreditCardPayment(double amount) {
		super(amount);	
	}

	@Override
	void makePayment() {
		System.out.println("Credit Card payment is Done...");
	}
}

class UpiPayment extends Payments {
	UpiPayment(double amount) {
		super(amount);
	}

	@Override
	void makePayment() {
		System.out.println("Upi payment is Done...");
	}
}

public class Payment {
	public static void main(String[] args) {
		Payments py = new CreditCardPayment(90000);
		py.makePayment();
		System.out.println("Credit Card Payment Process is Completed");
		
		Payments py2 = new UpiPayment(90000);
		py2.makePayment();
		System.out.println("Upi Payment Payment Process is Completed");
		
	}
}

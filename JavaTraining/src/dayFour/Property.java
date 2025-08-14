package dayFour;

class Expense {
	int rent;
	double lightBill;
	double houseTax;
	
	public void totalRent(int rent, double houseTax) {
		this.rent = rent;		
		this.houseTax = houseTax;	
		System.out.println("Rent: "+ rent);
		System.out.println("houseTax: "+ houseTax);
		System.out.println("Total Expense without lightbill: " + (rent + houseTax));
	}
	
	public void totalRent(int rent, double lightBill, double houseTax) {
		this.rent = rent;
		this.lightBill = lightBill;
		this.houseTax = houseTax;	
		System.out.println("Rent: "+ rent);
		System.out.println("lightBill: "+ lightBill);
		System.out.println("houseTax: "+ houseTax);
		System.out.println("Total Expense with lightbill: " + (rent+ lightBill+ houseTax));
	}
	
}

public class Property {
	public static void main(String[] args) {
		Expense e = new Expense();
		e.totalRent(7500, 10);
		System.out.println("==============================");
		e.totalRent(10000, 1000, 20);
	}
}

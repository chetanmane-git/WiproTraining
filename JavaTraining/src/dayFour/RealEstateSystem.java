package dayFour;

import java.util.Scanner;

abstract class RentCalculator {
	abstract void tax(double rent);
}

class Apartment extends RentCalculator {

	@Override
	void tax(double rent) {
		// TODO Auto-generated method stub
		double tax = 10 * rent/100;
		double rentApart = tax + rent;
		
		System.out.println("Tax for apartment (10% of " + rent + "): " + tax);
		System.out.println("Final apartment rent: " + rentApart);
	}	
}

class House extends RentCalculator {

	@Override
	void tax(double rent) {
		// TODO Auto-generated method stub
		double tax = 20 * rent/100;
		double rentHouse = tax + rent;
		
		System.out.println("Tax for House (10% of " + rent + "): " + tax);
		System.out.println("Final house rent: " + rentHouse);
	}
	
}

public class RealEstateSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your category (Apartment/House): ");
		String category = sc.next();
		System.out.print("Enter base rent amount: ");
	    double rent = sc.nextDouble();
	    RentCalculator rc;
	    if(category.equalsIgnoreCase("Apartment")) {
	    	rc = new Apartment();
	    	
	    }else if(category.equalsIgnoreCase("House")) {
	    	rc = new House();
	    }else {
	    	System.out.println("Invalid category entered.");
	    	sc.close();
	    	return;
	    }
	    rc.tax(rent);
	    sc.close();
	}
}






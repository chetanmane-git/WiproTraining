package dayFour;

abstract class Vehicle {
	abstract void brand();
	abstract void speed();
}

class Car extends Vehicle {

	@Override
	void brand() {
		// TODO Auto-generated method stub
		System.out.println("Brand of Car: Thar");		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed of Car: 100Km/hr.");		
	}	
}

class Bike extends Vehicle {

	@Override
	void brand() {
		// TODO Auto-generated method stub
		System.out.println("Brand of Bike: R15");		
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed of Car: 130Km/hr.");		
	}	
}

public class VehicleDrive {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.brand();
		v1.speed();
		
		Vehicle v2 = new Bike();
		v2.brand();
		v2.speed();
	}
}








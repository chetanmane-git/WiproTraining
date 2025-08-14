package dayFour;

interface WiproSystems {
	void deviceType();
	void compilerSpeed();
}

class MacBook implements WiproSystems {

	@Override
	public void deviceType() {
		// TODO Auto-generated method stub
		System.out.println("Wipro Provides: MacBook");
	}

	@Override
	public void compilerSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Compiler is faster in MacBook");	
	}	
}

class LenovoIedaPad implements WiproSystems {
	
	@Override
	public void deviceType() {
		// TODO Auto-generated method stub
		System.out.println("Wipro Provides: LenovoIedaPad");
	}
	
	@Override
	public void compilerSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Compiler is slower in LenovoIedaPad");	
	}	
}

public class WiproDevices {
	public static void main(String[] args) {
		WiproSystems w1 = new MacBook();
		w1.deviceType();
		w1.compilerSpeed();
		
		WiproSystems w2 = new LenovoIedaPad();
		w2.deviceType();
		w2.compilerSpeed();
	}

}
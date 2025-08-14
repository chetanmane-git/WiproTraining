package dayFive;

public interface Calculator {
	void add(int a, int b);
	default double substract(double a, double b) {
		return (a+b);
	}
	static int multiply(int a, int b) {
		return (a*b);
	}	
}

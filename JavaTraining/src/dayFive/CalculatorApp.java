package dayFive;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator c = new Operations();
		c.add(100, 400);
		System.out.println("Substraction is: " + c.substract(129.89, 10.809));
		System.out.println("Multiplication is: " + Calculator.multiply(19, 8));		
	}
}

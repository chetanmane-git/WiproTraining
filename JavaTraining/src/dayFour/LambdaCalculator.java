package dayFour;

interface LambdaCalculator1 {
	double add(double a, double b);
}

public class LambdaCalculator {
	public static void main(String[] args) {
		LambdaCalculator1 addition = (a, b) -> {			
			double result = a+b;
			System.out.println("Addition result: " + result);
			return result;
		};
		
		LambdaCalculator1 substraction = (a, b) -> a-b;
		
		double a = 1000.0, b= 2000.0;
		
		addition.add(200, 100);
		System.out.println("Substraction: " + substraction.add(a, b));
	}
}

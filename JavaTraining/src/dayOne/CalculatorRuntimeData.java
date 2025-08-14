package dayOne;

public class CalculatorRuntimeData {

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		CalculatorRuntimeData calc = new CalculatorRuntimeData();
		int sum = calc.add(193, 789);
		System.out.println("Sum = " + sum);

	}
}

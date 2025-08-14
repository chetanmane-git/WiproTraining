package daySix;

import java.util.Scanner;

public class FactorialTryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How much numbers you want from fib. series: ");
		int n = scanner.nextInt();
		try {

			if (n <= 0) {
				System.out.println("Please Don't enter negative numbers.");
				return;
			}

			System.out.println("Fibonacci Series up to " + n + " terms:");
			int a = 0, b = 1;

			for (int i = 1; i <= n; i++) {
				System.out.print(a + " ");
				int next = a + b;
				a = b;
				b = next;
			}

		} catch (Exception e) {
			System.out.println("Invalid input! Please enter a valid integer.");
		} finally {
			scanner.close();
		}
	}
}

package dayOne;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
	public void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Factorial: " + fact(num));
	}

}

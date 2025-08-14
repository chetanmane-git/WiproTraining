package dayOne;

public class MinMaxArray {
	public static void main(String[] args) {

		int[] arr = {125, 30, 38, 89, 680 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);
	}
}

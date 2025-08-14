package daySix;

public class ArrayOutOfBound {
	public static void main(String[] args) {
		int[] arr = {12, 34, 45, 65, 8};
		try {
			System.out.println("Iteration of elements from array:");
			for(int i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This exception occured: " + e.getMessage());
		}
	}
}

package daySix;

public class DivisionTryCatch {
	public static void main(String[] args) {	
		int i = 10, j=0;
		try {
			int res = i/j;
		}catch(Exception e) {
			System.out.println("Error occured while division operation: " + e.getMessage());
		}finally {
			System.out.println("Process Completed.");
		}
	}
}

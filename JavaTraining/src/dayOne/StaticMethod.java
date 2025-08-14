package dayOne;

public class StaticMethod {
    public static int add(int x, int y) {
        return x + y;
    }
}

class StaticMethod1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = StaticMethod.add(35, 722);
		System.out.println("Sum: " + sum);
	}

}

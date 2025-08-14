package dayEight;

public class Wrapper {
	public static void main(String[] args) {
		float a = 12.2f;
		Float f = a; //AutoBoxing : when we convert float datatype to integer.
		float b = f.floatValue(); //Unboxing : object back to int datatype.
		System.out.println(b);		
	}
}

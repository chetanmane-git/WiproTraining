package dayTwo;

public class Polymorphism {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		System.out.println(p.add(5, 10));
		System.out.println(p.add(10, 20,30));
	}
}

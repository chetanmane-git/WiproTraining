package daySix;

import dayOne.Factorial;

public class ImportPkg {
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println(obj.fact(4));
		obj.display();		
	}
}

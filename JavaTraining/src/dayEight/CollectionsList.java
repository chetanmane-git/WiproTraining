	package dayEight;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(60);
		l.add(50);
		
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.indexOf(60));
		
		for(int i=0; i<l.size(); i++) {
			System.out.print(l.get(i) + " ");					
		}
		System.out.println("\n=====================");
		for(Object i : l) {
			int data = (Integer) i;
			System.out.println(data);
		}
	}
}

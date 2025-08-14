package dayTen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listiterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Abhi", "Chetan", "Om", "Shyam"));	
		ListIterator<String> it = list.listIterator();
	
		System.out.println("Forward Iteration:");	
		while (it.hasNext()) {
	
		System.out.println(it.next()); }
	
		System.out.println("Backward Iteration:");	
		while (it.hasPrevious()) { 
			System.out.println(it.previous()); 
		}
	}
}

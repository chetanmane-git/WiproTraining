package dayEight;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTreeset {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(92);
		s.add(23);
		s.add(56);
		
		System.out.println(s);
		
		Iterator<Integer> iterator = s.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

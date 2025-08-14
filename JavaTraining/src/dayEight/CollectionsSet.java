package dayEight;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsSet {
	public static void main(String[] args) {
		Set<Integer> setData = new HashSet<Integer>();
		setData.add(10);
		setData.add(13);
		setData.add(80);
		setData.add(30);
		setData.add(69);
		setData.add(45);	
		
		System.out.println(setData);
		
		Iterator<Integer> iterator = setData.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
	}
}

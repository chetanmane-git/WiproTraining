package dayEight;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("CS", 70);
		m.put("IT", 71);
		m.put("Mech.", 72);
		m.put("Ele.", 73);
		m.put("Civil", 74);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println("Key Value Pairs:");
		for(String key : m.keySet()) {
			System.out.println(key + "  " + m.get(key));
		}
	}
}

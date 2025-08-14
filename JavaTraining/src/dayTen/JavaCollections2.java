package dayTen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollections2 {
	public static void main(String[] args) {
		ArrayList<String> branches = new ArrayList<>();
		branches.add("IT");
		branches.add("Mechanical");
		branches.add("CS");
		branches.add("Civil");
		branches.add("Eletronics");
		
		for(String c : branches) {
			System.out.println(c);
		}
		
		System.out.println("--------------------------");
		
		Set<Integer> branchID = new HashSet<>();
		branchID.add(331);
		branchID.add(502);
		branchID.add(3);
		branchID.add(554);
		branchID.add(305);
		
		for(int i : branchID) {
			System.out.println(i);
		}
		
		Map<String, Integer> branchNumber = new HashMap<>();
		branchNumber.put("IT", 101);
		branchNumber.put("Mechanical", 102);
		branchNumber.put("CS", 103);
		branchNumber.put("Civil", 104);
		branchNumber.put("Eletronics", 105);
		for(String c : branchNumber.keySet()) {
			System.out.println(c + "=" + branchNumber.get(c));
		}
		
		
		
		
	}
}

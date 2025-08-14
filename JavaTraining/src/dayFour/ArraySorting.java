package dayFour;

import java.util.ArrayList;
import java.util.Collections;


public class ArraySorting {
	public static void main(String[] args) {
		
		ArrayList<String> companies = new ArrayList<String>();			
		companies.add("Mahindra");
		companies.add("Wipro");
		companies.add("TATA");
		companies.add("Capgemini");
		companies.add("Cognizant");
		companies.add("Google");				
	
		System.out.println("ArrayList of companies before sorting is : " + companies);
	 
		Collections.sort(companies);
		
		System.out.println("ArrayList of companies after sorting is : " + companies);
	}
}

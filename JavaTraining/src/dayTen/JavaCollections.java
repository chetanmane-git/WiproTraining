package dayTen;

import java.util.ArrayList;

public class JavaCollections {
	class department {
		private String name;
		private double sales;
		private double expenses;
		
		public department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		
		public double getProfit() {
				return (sales - expenses);
		}
		
		public String getName() {
			return name;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<department> depart = new ArrayList<department>();
		depart.add(new JavaCollections().new department("Sales", 1244000, 13000));
		depart.add(new JavaCollections().new department("Marketing", 31000, 100));
		depart.add(new JavaCollections().new department("Research", 25000, 2100));
		
		for(department d : depart) {
			System.out.println(d.getName() + "Profit: " + d.getProfit());
		}
		
		depart.sort((d1, d2)-> Double.compare(d1.getProfit(), d2.getProfit()));
		
		System.out.println("-------------------------------------");
		System.out.println("According to profit ordering:");
		
		for(department d : depart) {
			System.out.println(d.getName() + "Profit: " + d.getProfit());
		}			
	}

}

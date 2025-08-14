package dayTwo;

public class SaleSystem {
	 static class Book {
	        String name;
	        double price;
	        int quantity;
	        
	        void setDetails(String n, double p, int q) {
	            name = n;
	            price = p;
	            quantity = q;
	        }

	        double getTotal() {
	            return price * quantity;
	        }

	        // Method to display
	        void display() {
	            System.out.println(name + "\t" + price + "\t" + quantity + "\t" + getTotal());
	        }
	    }

	    public static void main(String[] args) {
	        // Create book objects
	        Book b1 = new Book();
	        Book b2 = new Book();
	        Book b3 = new Book();
	        Book b4 = new Book();

	        b1.setDetails("Python Book", 450, 2);
	        b2.setDetails("Java Book", 500, 1);
	        b3.setDetails("Web Dev Book", 600, 1);
	        b4.setDetails("Full Stack Book", 800, 1);

	        double totalAmount = 0;

	        System.out.println("Book Name\tPrice\tQty\tTotal");
	        b1.display(); totalAmount += b1.getTotal();
	        b2.display(); totalAmount += b2.getTotal();
	        b3.display(); totalAmount += b3.getTotal();
	        b4.display(); totalAmount += b4.getTotal();

	        System.out.println("\nTotal Bill Amount = ₹" + totalAmount);
	    }
}

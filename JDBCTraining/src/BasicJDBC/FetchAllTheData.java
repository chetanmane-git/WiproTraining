package BasicJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllTheData {
	public static void main(String[] args) {
		try {
			// Step-1 : Load the JDBC driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...!");
			
			// Step-2 : Establish a connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_practice", "root", "root");
			System.out.println("Connection Established Successfully...!");
			
			// Step-3 : Create a statement. 
			Statement stmt = con.createStatement();
			System.out.println("Statement Created...!");
			
			// Step-4 : Execute queries and process results.
			String sql = "select * from roommate";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Query Executed...!");
			
			// Step-5 : Closing the resources.
			System.out.println("RId | name   |   email         | maritalStatus | age  | DId  | weight ");
			System.out.println("=======================================================================");
			while(rs.next()) {				
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
				+ " " + rs.getInt(5) + " " + rs.getInt(6) + " " + rs.getInt(7));
			}
			
			// Step-6 : Close the connection.
			con.close();
			stmt.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

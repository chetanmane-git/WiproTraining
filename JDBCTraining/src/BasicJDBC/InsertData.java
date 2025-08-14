package BasicJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String driverPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mysql_practice?user=root&password=root";
		String sql = "insert into roommate values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Class.forName(driverPath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter RId, name, emeil, maritalStatus, age, DId, weight");
			int id = sc.nextInt();
			String name = sc.next();
			String email = sc.next();
			String maritalStatus = sc.next();
			int age = sc.nextInt();
			int dId = sc.nextInt();
			int weight = sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, maritalStatus);
			ps.setInt(5, age);
			ps.setInt(6, dId);
			ps.setInt(7, weight);
			
			int numOfRowsAffected = ps.executeUpdate();
			
			System.out.println(numOfRowsAffected + " rows affected.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
				ps.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}							
	}
}

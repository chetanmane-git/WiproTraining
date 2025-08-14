package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Insert {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String driverPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/wipro_jdbc?user=root&password=root";
		String sql = "insert into demo values(?, ?, ?)";

		try {
			Class.forName(driverPath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter Id, name, email");
			int id = sc.nextInt();
			String name = sc.next();
			String email = sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			
			int numOfRowsAffected = ps.executeUpdate();

			System.out.println(numOfRowsAffected + " rows affected.");

		} catch (Exception e) {
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

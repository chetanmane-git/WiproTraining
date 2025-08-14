package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/wipro_jdbc";
		String username = "root";
		String pwd = "root";
		String query = "select * from demo";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1) + "\nName: " + rs.getString(2) + "\nEmail: " + rs.getString(3));
		}
		st.close();
		con.close();
	}
}	

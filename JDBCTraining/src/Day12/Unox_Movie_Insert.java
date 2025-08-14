package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Unox_Movie_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_jdbc", "root", "root");
			Statement stmt = con.createStatement();
			String sql = "select * from movies";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("movie_id |title |genre |rating |status  |poster_image_url");
			System.out.println("=======================================================================");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "	" + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getBigDecimal(4) + " " + rs.getString(5) + " " + rs.getString(6));
			}
			con.close();
			stmt.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

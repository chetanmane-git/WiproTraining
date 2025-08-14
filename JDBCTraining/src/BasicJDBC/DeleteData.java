package BasicJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DeleteData {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/mysql_practice?user=root&password=root";
		String sql = "delete from roommate where RId=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.print("Enter the RId to delete the record : ");
			int rId = sc.nextInt();
			ps.setInt(1, rId);
			int nora = ps.executeUpdate();
			System.out.println(nora + " no. of row(s) deleted...");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				ps.close();
				sc.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}	

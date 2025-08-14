package BasicJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/mysql_practice?user=root&password=root";
		PreparedStatement ps = null;
		String sql = "update roommate set name=? where RId=?";
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);	
			ps = con.prepareStatement(sql);
			System.out.println("Enter new name and RId : ");
			String newName = sc.nextLine();
			int rId = sc.nextInt();
			ps.setString(1, newName);;
			ps.setInt(2, rId);
			
			int nora = ps.executeUpdate();
			System.out.println(nora + " row(s) updated...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				ps.close();
				sc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

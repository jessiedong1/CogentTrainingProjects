import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBCPreparedStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world_innodb?serverTimezone=UTC";
		String uname="nitin";
		String pass="admin";

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name:");
		String countryname = sc.next();
		String query = "select * from eu_countries where name like ?";
		;
	
		try (Connection con = DriverManager.getConnection(url, uname, pass);
				PreparedStatement st = con.prepareStatement(query)) {
			st.setString(1, countryname);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				int np = rs.getInt(2);
				int id = rs.getInt(3);
				System.out.println(name + "\t\t" + np + "\t\t" + id);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		
		
	}

}

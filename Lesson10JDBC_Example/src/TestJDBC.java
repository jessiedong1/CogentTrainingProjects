import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/world";
		String uname = "root";
		String pass = "Jessie86725736";
		
		String query = "select * from city where id = 1 limit 10";
		try(Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)){
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getInt(5));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
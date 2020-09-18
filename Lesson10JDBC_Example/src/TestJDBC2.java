import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/world";
		String uname = "root";
		String pass = "Jessie86725736";
		
		String query = "update country set population=100 where name like 'Albania'";
		try(Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st = con.createStatement()){
			int n = st.executeUpdate(query);
			System.out.println(n);
			if(n>0) {
				System.out.println("Update successful");
			}
			else {
				System.out.println("Update failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

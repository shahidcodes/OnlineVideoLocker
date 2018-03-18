import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMysql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevideolocker", "root", "");
		
		Statement statement = connection.createStatement();
		
		String query = "SELECT * FROM users";
		
		ResultSet result = statement.executeQuery(query);


		while(result.next()) {
			String username = result.getString("username");
			String email = result.getString("email");
			
			System.out.println("User=> username= " + username + ", email: " + email);
		}
		
		connection.close();
		
	}

}

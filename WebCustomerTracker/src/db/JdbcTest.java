package db;


import java.sql.Connection;
import java.sql.DriverManager;



public class JdbcTest {

	public static void main(String[] args) {
		
		
		String jdbcurl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String username = "springstudent";
		String password = "springstudent";
		try {
			System.out.println("Connecting to database "+jdbcurl);
			Connection conn =
					DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connection SUccessful");
			conn.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

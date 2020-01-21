package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;



public class JdbcTest {

	public static void main(String[] args) {
		
		
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username = "root";
		String password = "kiranluitel";
		try {
			System.out.println("Connecting to database "+jdbcurl);
			Connection conn =
					DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connection SUccessful");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDriver {

	public static Connection connect() {
		String url = "jdbc:sqlite:src/Model/amazon2.db";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url);
		}
		catch(SQLException e) {
			System.out.print(e.getMessage());
		}
		
		return conn;
	}
	
	
}

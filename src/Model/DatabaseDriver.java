package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public static void displayAll(){
        String sql = "SELECT Name, Age, Grade, School, ID FROM class";
        
        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("Name") +  "\t" + 
                                   rs.getInt("Age") + "\t" +
                                   rs.getInt("Grade") + "\t" +
                                   rs.getString("School") + "\t" +
                                   rs.getInt("Id"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

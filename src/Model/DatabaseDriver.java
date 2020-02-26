package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

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
	
	public static LinkedList<Product> BuildLL(int filter, String searchTerm){
		
		String sql;
		int sType;
		Product temp = null;
		LinkedList<Product> returnList = new LinkedList();
		
		switch(filter) {
		case 1:
			sql = "SELECT pID, Name, Price, Description, Category, INSTR(Category, '"+searchTerm+"') peeps FROM products WHERE peeps > 0;";
			break;
		case 2:
			sql = "SELECT pID, Name, Price, Description, Category, INSTR(Name, '"+searchTerm+"') peeps FROM products WHERE peeps > 0;";
			break;
		default:
			sql = "ERROR";
		}
        
        try(Connection conn = connect();
        		PreparedStatement pstmt = conn.prepareStatement(sql)) {
        	
        	//pstmt.setInt(1, character);
        	
        	ResultSet rs = pstmt.executeQuery();
        	
        	while(rs.next()) {
        		
        		sType = GetProductType(rs.getString("Category"));
        		
        		switch(sType) {
        		case 1:
        			 temp = new Clothing();
        			break;
        		case 2:
        			 temp = new Electronic();
        			break;
        		case 3:
        			 temp = new Fresh();
        			break;
        		case 4:
        			temp = new Game();
        			break;
				default:
					System.out.print("Error in creating temp object");
        		}
        		
        		temp.setID(rs.getInt("pID"));
        		temp.setName(rs.getString("Name"));
        		temp.setPrice(rs.getFloat("Price"));
        		temp.setDescription(rs.getString("Description"));
        		temp.setType(rs.getString("Category"));
        		
        		returnList.add(temp);
        	}
        } catch(SQLException e) {
        	System.out.println(e.getMessage());
        }
        
        return returnList;
    }
	
	private static int GetProductType(String type) {
		int retVal = 0;
		
		if(type.equalsIgnoreCase("Clothing"))
			retVal = 1;
		else if(type.equalsIgnoreCase("Electronics"))
			retVal = 2;
		else if(type.equalsIgnoreCase("Fresh"))
			retVal = 3;
		else if(type.equalsIgnoreCase("Game"))
			retVal = 4;
		
		return retVal;
	}

	private static ArrayList<Integer> GetRandomIntegers(){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int temp = 0;
		for(int i = 0; i < 5; i++){
			temp = RandomInt();
			while(nums.contains(temp))
				temp = RandomInt();
			nums.add(temp);
		}

		return nums;
	}

	private static int RandomInt(){
		Random rand = new Random();
		int retInt = rand.nextInt(20) + 1;
		return retInt;
	}

	public static LinkedList<Product> BuildSplashLL(){
		LinkedList<Product> returnList = new LinkedList<Product>();
		ArrayList<Integer> selID = GetRandomIntegers();
		Product temp = null;
		int sType;

		for(int i = 0; i < 5; i++){
			String sql = "Select pID, Name, Price, Description, Category, INSTR(pID, '"+ selID.get(i) +"' peeps FROM products where peeps > 0";

			try(Connection conn = connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

				ResultSet rs = pstmt.executeQuery();

				while(rs.next()) {

					sType = GetProductType(rs.getString("Category"));

					switch(sType) {
						case 1:
							temp = new Clothing();
							break;
						case 2:
							temp = new Electronic();
							break;
						case 3:
							temp = new Fresh();
							break;
						case 4:
							temp = new Game();
							break;
						default:
							System.out.print("Error in creating temp object");
					}

					temp.setID(rs.getInt("pID"));
					temp.setName(rs.getString("Name"));
					temp.setPrice(rs.getFloat("Price"));
					temp.setDescription(rs.getString("Description"));
					temp.setType(rs.getString("Category"));

					returnList.add(temp);
				}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return returnList;
	}
}

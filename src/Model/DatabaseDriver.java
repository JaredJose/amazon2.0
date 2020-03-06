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
				sql = "SELECT pID, Name, Price, Description, Category, Material, Production, Genre, Calories, Image, INSTR(Category, '"+searchTerm+"') peep1 FROM products WHERE peep1 > 0;";
				break;
			case 2:
				sql = "SELECT pID, Name, Price, Description, Category, Material, Production, Genre, Calories, Image, INSTR(Name, '"+searchTerm+"') peep2 FROM products WHERE peep2 > 0;";
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
						temp = new Clothing(rs.getString("Material"));
						break;
					case 2:
						temp = new Electronic(rs.getBoolean("Production"));
						break;
					case 3:
						temp = new Fresh(rs.getInt("Calories"));
						break;
					case 4:
						temp = new Game(rs.getString("Genre"));
						break;
					default:
						System.out.print("Error in creating temp object");
				}

				temp.setID(rs.getInt("pID"));
				temp.setName(rs.getString("Name"));
				temp.setPrice(rs.getFloat("Price"));
				temp.setDescription(rs.getString("Description"));
				temp.setType(rs.getString("Category"));
				temp.setImageURL(rs.getString("Image"));

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

	public static CircleQueue<Product> BuildSplashLL(){
		CircleQueue<Product> returnQueue = new CircleQueue<Product>();
		ArrayList<Integer> selID = GetRandomIntegers();
		Product temp = null;
		int sType;

		for(int i = 0; i < 5; i++){
			String sql = "Select pID, Name, Price, Description, Category, Material, Production, Calories, Genre FROM products where pID == "+selID.get(i)+";";

			try(Connection conn = connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

				ResultSet rs = pstmt.executeQuery();

				while(rs.next()) {

					sType = GetProductType(rs.getString("Category"));

					switch(sType) {
						case 1:
							temp = new Clothing(rs.getString("Material"));
							break;
						case 2:
							temp = new Electronic(rs.getBoolean("Production"));
							break;
						case 3:
							temp = new Fresh(rs.getInt("Calories"));
							break;
						case 4:
							temp = new Game(rs.getString("Genre"));
							break;
						default:
							System.out.print("Error in creating temp object");
					}

					temp.setID(rs.getInt("pID"));
					temp.setName(rs.getString("Name"));
					temp.setPrice(rs.getFloat("Price"));
					temp.setDescription(rs.getString("Description"));
					temp.setType(rs.getString("Category"));

					returnQueue.add(temp);
				}
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return returnQueue;
	}

	public static LinkedList<Product> AddToCart(LinkedList<Product> currentCart, int pID){
		String sql = "SELECT pID, Name, Price, Description, Category, Material, Production, Calories, Genre FROM products where pID == "+pID+";";
		int sType;
		Product temp = null;

		try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {

			//pstmt.setInt(1, character);

			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {

				sType = GetProductType(rs.getString("Category"));

				switch(sType) {
					case 1:
						temp = new Clothing(rs.getString("Material"));
						break;
					case 2:
						temp = new Electronic(rs.getBoolean("Production"));
						break;
					case 3:
						temp = new Fresh(rs.getInt("Calories"));
						break;
					case 4:
						temp = new Game(rs.getString("Genre"));
						break;
					default:
						System.out.print("Error in creating temp object");
				}

				temp.setID(rs.getInt("pID"));
				temp.setName(rs.getString("Name"));
				temp.setPrice(rs.getFloat("Price"));
				temp.setDescription(rs.getString("Description"));
				temp.setType(rs.getString("Category"));

				currentCart.add(temp);
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}

		return currentCart;
	}

	public static Product getProd(String name) {
		String sql = "SELECT pID, Name, Price, Description, Category, Material, Production, Calories, Genre, INSTR(Name, '"+name+"') peep3 FROM products where peep3 > 0;";
		int sType;
		Product temp = null;

		try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {

			//pstmt.setInt(1, character);

			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {

				sType = GetProductType(rs.getString("Category"));

				switch(sType) {
					case 1:
						temp = new Clothing(rs.getString("Material"));
						break;
					case 2:
						temp = new Electronic(rs.getBoolean("Production"));
						break;
					case 3:
						temp = new Fresh(rs.getInt("Calories"));
						break;
					case 4:
						temp = new Game(rs.getString("Genre"));
						break;
					default:
						System.out.print("Error in creating temp object");
				}

				temp.setID(rs.getInt("pID"));
				temp.setName(rs.getString("Name"));
				temp.setPrice(rs.getFloat("Price"));
				temp.setDescription(rs.getString("Description"));
				temp.setType(rs.getString("Category"));

			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return temp;
	}

	public static Clothing pullClothing(LinkedList<Product> list) {
		Clothing temp = (Clothing) list.getFirst();
		list.removeFirst();
		return temp;
	}

	public static Electronic pullElectronic(LinkedList<Product> list) {
		Electronic temp = (Electronic) list.getFirst();
		list.removeFirst();
		return temp;
	}

	public static Game pullGame(LinkedList<Product> list) {
		Game temp = (Game) list.getFirst();
		list.removeFirst();
		return temp;
	}

	public static Fresh pullFresh(LinkedList<Product> list) {
		Fresh temp = (Fresh) list.getFirst();
		list.removeFirst();
		return temp;
	}

	public static CircleQueue<Product> BuildCategoryCQ(String category){
		CircleQueue<Product> returnQueue = new CircleQueue<Product>();
		Product temp = null;
		int sType;

		String sql = "Select pID, Name, Price, Description, Category, Material, Production, Calories, Genre, INSTR(Category, '"+category+"' peep4 FROM products where peep4 > 0;";

		try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {

			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {

				sType = GetProductType(rs.getString("Category"));

				switch(sType) {
					case 1:
						temp = new Clothing(rs.getString("Material"));
						break;
					case 2:
						temp = new Electronic(rs.getBoolean("Production"));
						break;
					case 3:
						temp = new Fresh(rs.getInt("Calories"));
						break;
					case 4:
						temp = new Game(rs.getString("Genre"));
						break;
					default:
						System.out.print("Error in creating temp object");
				}

				temp.setID(rs.getInt("pID"));
				temp.setName(rs.getString("Name"));
				temp.setPrice(rs.getFloat("Price"));
				temp.setDescription(rs.getString("Description"));
				temp.setType(rs.getString("Category"));

				returnQueue.add(temp);
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return returnQueue;
	}


	public static String getProdTypeFromName(String name) {
		String sql = "SELECT pID, Name, Price, Description, Category, Material, Production, Calories, Genre, INSTR(Name, '"+name+"' peep5 FROM products where peep5 > 0;";
		int sType;
		String ret = "";

		try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {

			//pstmt.setInt(1, character);

			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {

				ret = rs.getString("Category");
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return ret;
	}
}
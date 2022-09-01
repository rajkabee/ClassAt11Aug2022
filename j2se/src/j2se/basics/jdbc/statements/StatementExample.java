package j2se.basics.jdbc.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";
		Class.forName(driver);
		Product p = new Product("Mug", "china", "coffee mug", 450.34f, true);
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connected to the database...");
		String query = "insert into product (name, manufacturer, "
				+ "description, price, inStock) values('"
				+p.name
				+ "', '"+p.manufacturer
				+ "', '"+p.description
				+ "', "+p.price
				+ ","+p.inStock+")";
		System.out.println(query);
		Statement stm = con.createStatement();
		stm.executeUpdate(query);
		con.close();
		
		
		
		
	}
}

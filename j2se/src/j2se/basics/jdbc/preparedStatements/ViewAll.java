package j2se.basics.jdbc.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewAll {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		String query = "select * from product";
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id: ");
		ResultSet rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product p = new Product();
			p.id= rs.getInt("id");
			p.name = rs.getString("name");
			p.manufacturer = rs.getString("manufacturer");
			p.description = rs.getString("description");
			p.price = rs.getFloat("price");
			p.inStock = rs.getBoolean("inStock");
			products.add(p);
		}
		
		for(Product pd:products) {
			System.out.println(pd);
		}
		pstm.close();
		con.close();
		
	}
}

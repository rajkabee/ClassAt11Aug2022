package j2se.basics.jdbc.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadFromDatabase {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		String query = "select * from product where id = ?";
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the id: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next()) {
			p.id= rs.getInt("id");
			p.name = rs.getString("name");
			p.manufacturer = rs.getString("manufacturer");
			p.description = rs.getString("description");
			p.price = rs.getFloat("price");
			p.inStock = rs.getBoolean("inStock");
			
		}
		
		System.out.println(p);
		pstm.close();
		con.close();
		
	}
}

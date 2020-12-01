package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

public class JDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai","root","root");
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate("update address set addr_detail='2'"
					+ " where addr_name = 3");
			System.out.println(i);
//			while (resultSet.next()) {
//				System.out.println(resultSet.getString("name"));
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

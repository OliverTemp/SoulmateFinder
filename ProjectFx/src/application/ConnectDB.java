package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {

	public static Connection initializeDB() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1108");
			System.out.println("Database connected");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}

	public static ResultSet executeQuery(String sql) {
		ResultSet res = null;
		try {

			PreparedStatement ps = initializeDB().prepareStatement(sql);
			res = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}

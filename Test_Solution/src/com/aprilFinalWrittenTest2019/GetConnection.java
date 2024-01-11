package com.aprilFinalWrittenTest2019;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection doConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		//Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/voterinfo";
		String userName = "root";
		String password = "root";
		con = DriverManager.getConnection(url, userName, password);

		return con;
	}
}

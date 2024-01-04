package com.april_eclipse_test_2019;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection_Q9 {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/bankdatabase";
		String userName="root";
		String passWord="root";
		
		con=DriverManager.getConnection(url,userName,passWord);
		
		return con;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

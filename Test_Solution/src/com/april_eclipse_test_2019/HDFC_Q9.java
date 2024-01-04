package com.april_eclipse_test_2019;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * 9. Create a collection to store account type as key and value as list of all customers with
respective account type for bank name HDFC(without using joins)[2M]
 */
public class HDFC_Q9 {

	Connection con;
	ResultSet resAcc, resName;
	Statement sAcc, sName;
	String sqlAcc, sqlName;
	HashMap<String, ArrayList<String>> map = new HashMap<>();

	public void accName() {
		try {
			con = DatabaseConnection_Q9.getConnection();
			sqlAcc = "select * from accounttype";
			sqlName =  "select * from accounttype";
			sAcc = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			sName = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resAcc=sAcc.executeQuery(sqlAcc);
			resName=sName.executeQuery(sqlName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

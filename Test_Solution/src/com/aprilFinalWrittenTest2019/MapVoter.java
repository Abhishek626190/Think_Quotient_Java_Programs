package com.aprilFinalWrittenTest2019;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 * f.	Write a jdbc program to create a map which has VoterAadhar as key and
 *  Residence address as  value. Do not use any joins in the query 
 *  while selecting data. 
Also update Voting Area to ‘Nanded City’ where pincode is 411048.	

 */
public class MapVoter {

	Statement stat1;
	Statement stat2;
	ResultSet res1;
	ResultSet res2;
	HashMap<String, Residence> map = new HashMap<>();

	public void getData() {
		try {
			Connection con = GetConnection.doConnection();
			// System.out.println(con);
			String sql1 = " select * from voter ";
			String sql2 = " select * from residenceaddress";
			stat1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			res1 = stat1.executeQuery(sql1);
			stat2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			res2 = stat2.executeQuery(sql2);
//			System.out.println(res1);
//			System.out.println(res2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createMap() throws SQLException, ClassNotFoundException {

		int vid = 0;
		Residence obj = null;
		String addhar = null;

		while (res1.next()) {
			addhar = res1.getString(5);
			vid = res1.getInt(7);
			res2.beforeFirst();
			while (res2.next()) {
				int vid1 = 0;
				obj = null;
				vid1 = res2.getInt(1);
				if (vid == vid1) {
					obj = new Residence(res2.getInt(1), res2.getString(5), res2.getString(2), res2.getString(3),
							res2.getString(4), res2.getString(6), res2.getString(7));
					map.put(addhar, obj);

				}
			}
			// map.put(addhar, obj);
		}
		// System.out.println(map);
	}

	public void printMap() {
		Set<Entry<String, Residence>> set = map.entrySet();
		Iterator<Entry<String, Residence>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, Residence> e = itr.next();
			String id = e.getKey();
			Residence r = e.getValue();

			System.out.println("VAadhar Id: " + id);
			System.out.println("Residence: " + r);

		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		MapVoter obj = new MapVoter();
		obj.getData();
		obj.createMap();
		obj.printMap();

	}

}

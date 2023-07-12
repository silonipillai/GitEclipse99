package com.smartims.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.TreeSet;

public class DBResult {
	public void connectToDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			System.out.println("DB connection successful...........");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from persons where id=?");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " "
						+ rs.getString(4) + " " + rs.getFloat(5) + " " + rs.getInt(6));
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

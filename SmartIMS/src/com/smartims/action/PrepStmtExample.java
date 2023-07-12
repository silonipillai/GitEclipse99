package com.smartims.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class PrepStmtExample {
	public void insertRecord() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
			PreparedStatement stmt = con.prepareStatement("insert into actor values(?,?,?,?,?)");
			Timestamp currTime = new Timestamp(System.currentTimeMillis());
			
			stmt.setInt(1, 203);
			stmt.setString(2, "meow");
			stmt.setString(3, "...");
			stmt.setTimestamp(4, currTime);
			stmt.setString(5, "Success");
			
			int i = stmt.executeUpdate();
			System.out.println(i + "Records inserted");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PrepStmtExample ps = new PrepStmtExample();
		ps.insertRecord();
	}
}

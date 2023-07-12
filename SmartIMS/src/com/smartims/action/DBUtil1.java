package com.smartims.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil1 {

	public void insertEmpRecord(PersonVO pvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.insertQuery);
			ps.setInt(1, pvo.getId());
			ps.setString(2, pvo.getName());
			ps.setString(3, pvo.getAddress());
			ps.setString(4, pvo.getCity());
			ps.setFloat(5, pvo.getSalary());
			ps.setInt(6, pvo.getAge());
			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("Record inserted succesfully for the given ID : " + pvo.getId());
			else
				System.out.println("Failed to insert" + pvo.getId());
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private boolean checkForExistance(int empId) {
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.display);
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public void deleteRecord(int empId) {
		boolean recordPresent = checkForExistance(empId);
		if (recordPresent) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
				PreparedStatement ps = con.prepareStatement(CC.deleteQuery);
				ps.setInt(1, empId);
				int result = ps.executeUpdate();
				if (result > 0)
					System.out.println("Record deleted succesfully for the given ID : " + empId);
				else
					System.out.println("Failed to delete" + empId);
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Record not found for the ID :" + empId);
		}

	}

	public void selectRecord(int empId) {
		boolean recordPresent = checkForExistance(empId);
		if (recordPresent) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement stmt = con.prepareStatement(CC.display);
				stmt.setInt(1, empId);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " "
							+ rs.getString(4) + " " + rs.getFloat(5) + " " + rs.getInt(6));
				}

			}

			catch (Exception e) {
				e.printStackTrace();
			}
		} else
			System.out.println(empId + " doesnot exist");

	}

	public void retriveRecord() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			PreparedStatement stmt = con.prepareStatement(CC.displayAll);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " "
						+ rs.getString(4) + " " + rs.getFloat(5) + " " + rs.getInt(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
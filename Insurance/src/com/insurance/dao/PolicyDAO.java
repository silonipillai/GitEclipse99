package com.insurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.insurance.cc.CC;
import com.insurance.vo.PolicyVO;

public class PolicyDAO {

	public void registerPolicy(PolicyVO pvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.insertPolicy);
			ps.setInt(1, pvo.getPolicy_id());
			ps.setString(2, pvo.getPlan_name());
			ps.setString(3, pvo.getPlan_type());
			ps.setFloat(4, pvo.getPolicy_term());
			ps.setInt(5, pvo.getPremium());
			
			
			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("Registered Policy Details succesfully with ID:" + pvo.getPolicy_id());
			else
				System.out.println("Unable to register with ID:" + pvo.getPolicy_id());
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	boolean checkExistance(int pid) {
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayPolicy);
			ps.setInt(1, pid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}
	public void displayPolicy(int pid) {
		if (checkExistance(pid)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement stmt = con.prepareStatement(CC.displayPolicy);
				stmt.setInt(1, pid);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3) + " -- "
							+ rs.getFloat(4) + " -- " + rs.getInt(5));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("There is no book with ID: " + pid);
		}		
	}
	public void displayAll() {
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement stmt = con.prepareStatement(CC.displayAllPolicy);
				
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3) + " -- "
							+ rs.getFloat(4) + " -- " + rs.getInt(5));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	public void checkBI() {
		// TODO Auto-generated method stub
		
	}	
		
	}

	



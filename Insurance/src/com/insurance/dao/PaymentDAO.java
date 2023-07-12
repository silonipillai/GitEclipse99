package com.insurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.insurance.cc.CC;
import com.insurance.vo.PaymentVO;

public class PaymentDAO {
	boolean checkExistance(int cid) {
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayCus);
			ps.setInt(1, cid);
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

	public void displayPayByID(int cid) {
		if (checkExistance(cid)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement stmt = con.prepareStatement(CC.selectPayment);
				stmt.setInt(1, cid);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println(
							rs.getString(1) + " -- " + rs.getInt(2) + " -- " + rs.getInt(3) + " -- " + rs.getInt(4));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("There is no payment with ID: " + cid);
		}
	}



	public void registerPayment(PaymentVO pvo) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.insertPayment);
			ps.setString(1, pvo.getMode());
			ps.setInt(2, pvo.getC_id());
			ps.setInt(3, pvo.getPremium());
			ps.setInt(4, pvo.getPolicy_id());
			
			
			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("Registered Payment Details succesfully with ID:" + pvo.getPolicy_id());
			else
				System.out.println("Unable to register with ID:" + pvo.getPolicy_id());
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void paymentDetails() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
			System.out.println("DB connection successful...........");
			PreparedStatement stmt = con.prepareStatement(CC.selectPaymentDetails);
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " -- " + rs.getLong(2) + " -- " + rs.getInt(3) + " -- " + rs.getInt(4)+" -- "+rs.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
		
	}



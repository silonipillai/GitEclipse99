package com.smartims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.smartims.cc.CC;
import com.smartims.vo.VehicleVO;

public class VehicleDAO {

	public void insertVehicle(VehicleVO vvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");

			PreparedStatement ps = con.prepareStatement(CC.insertVehicle);

			ps.setString(1, vvo.getVin());
			ps.setString(2, vvo.getCity());
			ps.setString(3, vvo.getCompany());
			ps.setString(4, vvo.getModel());
			ps.setString(5, vvo.getFuel());
			ps.setInt(6, vvo.getCc());
			ps.setInt(7, vvo.getReg_yr());
			ps.setString(8, vvo.getType());
			ps.setInt(9, vvo.getPh_id());
			int result = ps.executeUpdate();
			
			if (result > 0)
				System.out.println("Registered Vehicle Details successfully with ID:" + vvo.getVin());
			else
				System.out.println("Unable to register with ID:" + vvo.getVin());

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}

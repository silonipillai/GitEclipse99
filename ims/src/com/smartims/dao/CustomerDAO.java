package com.smartims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.smartims.cc.CC;
import com.smartims.vo.CustomerVO;

public class CustomerDAO {

	public void insertCustomer(CustomerVO cvo) {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
				

				PreparedStatement ps = con.prepareStatement(CC.insertCustomer,Statement.RETURN_GENERATED_KEYS);

				ps.setString(1, cvo.getCus_name());
				ps.setString(2, cvo.getCus_email());
				ps.setLong(3, cvo.getCus_phone());
				ps.setString(4, cvo.getPassword());
				int result = ps.executeUpdate();
				ResultSet rs=ps.getGeneratedKeys();
				if(rs.next()) {
				
			    	
			    	System.out.println("Sucessfully Regsitered with Customer ID : "+rs.getInt(1));
			    	System.out.println("Please remember to Login");
				
			    }
				
				con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void login(int cus_id, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayCustomer);
			ps.setInt(1, cus_id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("Successfully Logged In ....");
			}
			else
				System.out.println("No Customer with ID :"+cus_id);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public void displayDetails(int ph_id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			//System.out.println("DB connection successful...........");
			PreparedStatement stmt = con.prepareStatement(CC.displayDetails);
			stmt.setInt(1, ph_id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("				  PERSONAL AUTO INSURANCE");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("POLICY HOLDER DETAILS");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Policy Holder ID            :    "+rs.getInt(1));
				System.out.println("Policy Holder Name          :    "+rs.getString(2));
				System.out.println("Policy Holder Phone Number  :    "+rs.getLong(3));
				System.out.println("Policy Holder Age           :    "+rs.getInt(5));
				System.out.println("Age                         :    "+rs.getString(6));
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("VEHICLE DETAILS");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("VIN                         :    "+rs.getString(15));
				System.out.println("Vehicle RTO or City         :    "+rs.getString(16));
				System.out.println("Vehicle Company             :    "+rs.getString(17));
				System.out.println("Vehicle Model               :    "+rs.getString(18));
				System.out.println("Vehicle Fuel Type           :    "+rs.getString(19));
				System.out.println("Vehicle CC                  :    "+rs.getInt(20));
				System.out.println("Vehicle Age                 :    "+rs.getInt(21));
				System.out.println("Vehicle Type                :    "+rs.getString(22)+" wheeler");
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("DRIVER DETAILS");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Driver Name                 :    "+rs.getString(8));
                System.out.println("Driver Age                  :    "+rs.getInt(9));
                System.out.println("Driving Experience          :    "+rs.getInt(10));
                System.out.println("Driving History             :    "+rs.getString(11));
                System.out.println("License Number              :    "+rs.getInt(12));
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	}

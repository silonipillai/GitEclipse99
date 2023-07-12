package com.smartims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.smartims.cc.CC;
import com.smartims.vo.UnderWriterVO;

public class UnderWriterDAO {

	

	public void insertUnderWriter(UnderWriterVO uvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.insertUnderWriter,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, uvo.getUw_name());
			ps.setString(2, uvo.getUw_email());
			ps.setString(3, uvo.getPassword());
			//int result = ps.executeUpdate();
			ResultSet rs=ps.getGeneratedKeys();
			if(rs.next()) 
				System.out.println("Registered UnderWriter Details succesfully with ID:" + rs.getInt(1));
			else
				System.out.println("Unable to register with ID:" + rs.getInt(1));
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	//--------
	boolean checkExistance(int uw_id) {
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayUnderWriter);
			ps.setInt(1, uw_id);
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

	public void login(int uw_id,String password) {
		UnderWriterVO uvo=new UnderWriterVO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayUnderWriter);
			ps.setInt(1, uw_id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("Successfully Logged In ....");
			}
			else
				System.out.println("No UnderWriter with ID :"+uw_id);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void reviewPolicy() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayPolicies);
			ResultSet rs = ps.executeQuery();
			System.out.println("Policy ID" + " -- " + "PolicyHolder ID" + " -- " + "term" + " -- "
					+ "Bodily Injury" + " -- " + "Property Damage" + " -- " + "Collision" + " -- "
					+ "Comprehensive" + " -- " + "Medical" + " -- " + "Status");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "         -- " + rs.getInt(2) + "               -- " + rs.getFloat(3) + "  -- "
						+ rs.getBoolean(4) + "          -- " + rs.getBoolean(5) + "            -- " + rs.getBoolean(6) + "      -- "
						+ rs.getBoolean(7) + "          -- " + rs.getBoolean(8) + "    -- " + rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	public void updateStatus(String status,int policy_id) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement stmt = con.prepareStatement(CC.updateStatus);
			stmt.setString(1, status);
			stmt.setInt(2, policy_id);
			

			int i = stmt.executeUpdate();
			if (i > 0) {
				System.out.println("Updated Status Successfully");
			}

			else {
				System.out.println("Invalid Credentials..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void checkList(int ph_id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayIssue);

			ps.setInt(1, ph_id);
			ResultSet rs = ps.executeQuery();
			//int ;
		
			while (rs.next()) {
				System.out.println("UnderWriter Issues CheckList :");
				if(rs.getInt(2)>1) 
					System.out.println("Condition 1)Experience is more than one year ie "+rs.getInt(2)+" Proceed");
				else
					System.out.println("Sorry! Does not have min Experience. Please reject the Policy");
				//if(add==city)
				//if(hyd==city) 
					//System.out.println("Proceed2");
				//else
					//System.out.println("Sorry! Vehicle City does not match with PolicyHolder City");
				if(rs.getInt(4)<25) 
					System.out.println("Condition 2)Vehicle age is less than 25 ie "+rs.getInt(4)+" Proceed");
				else
					System.out.println("Sorry! Vehicle is too old .Please reject the Policy");
				if(rs.getInt(3)<1500)
					System.out.println("Condition 3)Vehicle CC is less than 1500 ie "+rs.getInt(3)+" Proceed");
				else
					System.out.println("Sorry! Vehicle CC is more than 1500 .Please reject the Policy");
				System.out.println("Your  for Policy ID "+ph_id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}}

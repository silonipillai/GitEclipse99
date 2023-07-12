package com.smartims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.smartims.cc.CC;
import com.smartims.vo.PolicyVO;

public class PolicyDAO {

	public void registerPolicy(PolicyVO pvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");

			PreparedStatement ps = con.prepareStatement(CC.insertPolicy, Statement.RETURN_GENERATED_KEYS);

			ps.setInt(1, pvo.getPh_id());
			ps.setFloat(2, pvo.getTerm());
			ps.setBoolean(3, pvo.isBodily_injury());
			ps.setBoolean(4, pvo.isProperty_damage());
			ps.setBoolean(5, pvo.isCollision());
			ps.setBoolean(6, pvo.isComprehensive());
			ps.setBoolean(7, pvo.isMedical());
			int result=ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {

				System.out.println("Sucessfully Regsitered Policy with ID : " + rs.getInt(1));
				System.out.println("Please Login again to check Status and Premium ");
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkBI(int policy_id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayBI);

			ps.setInt(1, policy_id);
			ResultSet rs = ps.executeQuery();
			int pre=0;
			while (rs.next()) {
				//System.out.println(rs.getBoolean(1));
				if(rs.getBoolean(1)==true) {
					pre=1500;
					//System.out.println(pre);
				}
				if(rs.getBoolean(2)==true) {
					pre+=850;
					//System.out.println(pre);
				}
				if(rs.getBoolean(3)==true) {
					pre+=1500;
					//System.out.println(pre);
				}
				if(rs.getBoolean(4)==true) {
					pre+=650;
					//System.out.println(pre);
				}
				if(rs.getBoolean(5)==true) {
					pre+=850;
					//System.out.println(pre);
				}
				System.out.println("Your Premium for Policy ID "+policy_id+" is -- "+pre);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

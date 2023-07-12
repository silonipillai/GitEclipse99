package com.smartims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.smartims.cc.CC;
import com.smartims.vo.PolicyHolderVO;

public class PolicyHolderDAO {
	 public void insertHolder(PolicyHolderVO phvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");

			PreparedStatement ps = con.prepareStatement(CC.insertPolicyHolder, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, phvo.getPh_name());
			ps.setLong(2, phvo.getPhonenum());
			ps.setInt(3, phvo.getAge());
			ps.setString(4, phvo.getAddress());
			int result = ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {

				System.out.println("Sucessfully Regsitered with Policy Holder ID : " + rs.getInt(1));
				System.out.println("Please remember Policy Holder ID for all other operations");
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}

package com.smartims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;
import com.smartims.cc.CC;
import com.smartims.vo.DriverVO;

public class DriverDAO {
public void registerDriver(DriverVO dvo) {
	try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/ims?autoReconnect=true&useSSL=false", "root", "root");

		PreparedStatement ps = con.prepareStatement(CC.insertDriver, Statement.RETURN_GENERATED_KEYS);

		ps.setString(1, dvo.getDname());
		ps.setInt(2, dvo.getAge());
		ps.setInt(3, dvo.getExp());
		ps.setString(4, dvo.getDhistory());
		ps.setInt(5, dvo.getLicense_num());
		ps.setString(6,dvo.getVin());
		ps.setInt(7, dvo.getPh_id());
		int result = ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {

			System.out.println("Sucessfully Regsitered with ID : " + rs.getInt(1));

		}

		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
}

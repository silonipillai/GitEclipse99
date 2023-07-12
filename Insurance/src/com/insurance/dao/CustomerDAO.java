package com.insurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.insurance.cc.CC;
import com.insurance.vo.CustomerVO;

public class CustomerDAO {
	boolean checkExistance(int cid) {
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
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

	public void displayById(int cid) {
		if (checkExistance(cid)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement stmt = con.prepareStatement(CC.displayCus);
				stmt.setInt(1, cid);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3) + " -- "
							+ rs.getLong(4) + " -- " + rs.getString(5) + " -- " + rs.getInt(6) + " -- "
							+ rs.getBoolean(7) + " -- " + rs.getInt(8));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("There is no Customer with ID: " + cid);
		}
	}

	public void insertRecord(CustomerVO cvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.insertQuery);
			ps.setInt(1, cvo.getC_id());
			ps.setString(2, cvo.getC_name());
			ps.setString(3, cvo.getC_email());
			ps.setLong(4, cvo.getC_phoneno());
			ps.setString(5, cvo.isGender());
			ps.setInt(6, cvo.getAge());
			ps.setBoolean(7, cvo.isMarriage_status());
			ps.setInt(8, cvo.getPolicy_id());

			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("Registered Customer Details succesfully with ID:" + cvo.getC_id());
			else
				System.out.println("Unable to register with ID:" + cvo.getC_id());
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteCustomer(int cid) {
		if (checkExistance(cid)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement ps = con.prepareStatement(CC.deleteCus);
				ps.setInt(1, cid);
				int result = ps.executeUpdate();
				if (result > 0)
					System.out.println("Record deleted succesfully for the given ID : " + cid);
				else
					System.out.println("Failed to delete" + cid);
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(cid + " doesnot exist");
		}

	}

	public void updateMail(int cid, String email) {
		if (checkExistance(cid)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("Connected to Database Successfully");

				PreparedStatement stmt = con.prepareStatement(CC.updateMail);
				stmt.setString(1, email);
				stmt.setInt(2, cid);

				int i = stmt.executeUpdate();
				if (i > 0) {
					System.out.println("Updated Mail Successfully");
				}

				else {
					System.out.println("Invalid Credentials..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("There is no Customer with ID: " + cid);
		}
	}

	public void updateName(int cid, String name) {
		if (checkExistance(cid)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("Connected to Database Successfully");

				PreparedStatement stmt = con.prepareStatement(CC.updateName);
				stmt.setString(1, name);
				stmt.setInt(2, cid);

				int i = stmt.executeUpdate();
				if (i > 0) {
					System.out.println("Updated Name Successfully");
				}

				else {
					System.out.println("Invalid Credentials..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("There is no Customer with ID: " + cid);
		}

	}

	public void updatePhone(int cid, long phn) {
		if (checkExistance(cid)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("Connected to Database Successfully");

				PreparedStatement stmt = con.prepareStatement(CC.updatePhone);
				stmt.setLong(1, phn);
				stmt.setInt(2, cid);

				int i = stmt.executeUpdate();
				if (i > 0) {
					System.out.println("Updated Phone Number Successfully");
				}

				else {
					System.out.println("Invalid Credentials..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("There is no Customer with ID: " + cid);
		}

	}

	public void updateGender(int cid, String gender) {
		if (checkExistance(cid)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("Connected to Database Successfully");

				PreparedStatement stmt = con.prepareStatement(CC.updateGender);
				stmt.setString(1, gender);
				stmt.setInt(2, cid);

				int i = stmt.executeUpdate();
				if (i > 0) {
					System.out.println("Updated Gender Successfully");
				}

				else {
					System.out.println("Invalid Credentials..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		else {
			System.out.println("There is no Customer with ID: " + cid);
		}
	}

	public void updateAge(int cid, int age) {
		if (checkExistance(cid)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("Connected to Database Successfully");

				PreparedStatement stmt = con.prepareStatement(CC.updateAge);
				stmt.setInt(1, age);
				stmt.setInt(2, cid);

				int i = stmt.executeUpdate();
				if (i > 0) {
					System.out.println("Updated Age Successfully");
				}

				else {
					System.out.println("Invalid Credentials..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("There is no Customer with ID: " + cid);
		}

	}

	public void updateMarriage(int cid, boolean mrrg) {
		if (checkExistance(cid)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("Connected to Database Successfully");

				PreparedStatement stmt = con.prepareStatement(CC.updateMarriage);
				stmt.setBoolean(1, mrrg);
				stmt.setInt(2, cid);

				int i = stmt.executeUpdate();
				if (i > 0) {
					System.out.println("Updated Marraige Status Successfully");
				}

				else {
					System.out.println("Invalid Credentials..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("There is no Customer with ID: " + cid);
		}
	}

	public void updatePolicyid(int cid, int pid) {
		if (checkExistance(cid)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/insurance?autoReconnect=true&useSSL=false", "root", "root");
				System.out.println("Connected to Database Successfully");

				PreparedStatement stmt = con.prepareStatement(CC.updatePolicy);
				stmt.setInt(1, pid);
				stmt.setInt(2, cid);

				int i = stmt.executeUpdate();
				if (i > 0) {
					System.out.println("Updated Policy ID Successfully");
				}

				else {
					System.out.println("Invalid Credentials..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("There is no Customer with ID: " + cid);
		}
	}

}

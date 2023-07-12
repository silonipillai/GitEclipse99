package com.smartims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.smartims.cc.CC;
import com.smartims.vo.BookVO;

public class BookDAO {

	public void insertBook(BookVO bvo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.insertQuery);
			ps.setInt(1, bvo.getBookId());
			ps.setString(2, bvo.getBookName());
			ps.setInt(3, bvo.getPublishYear());
			ps.setString(4, bvo.getBookAuthor());
			ps.setFloat(5, bvo.getBookPrice());
			ps.setString(6, bvo.getCity());
			ps.setString(7, bvo.getGenere());
			ps.setBoolean(8, bvo.isInStock());
			ps.setString(9, bvo.getIsActive());
			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("Registered Book Details succesfully with ID:" + bvo.getBookId());
			else
				System.out.println("Unable to register with ID:" + bvo.getBookId());
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	boolean checkExistance(int bid) {
		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.display);
			ps.setInt(1, bid);
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

	public void searchBook(int bid) {
		boolean recordPresent = checkExistance(bid);
		if (recordPresent) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement stmt = con.prepareStatement(CC.display);
				stmt.setInt(1, bid);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3) + " -- "
							+ rs.getString(4) + " -- " + rs.getFloat(5) + " -- " + rs.getString(6) + " -- "
							+ rs.getString(7) + " -- " + rs.getBoolean(8) + " -- " + rs.getString(9));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("There is no book with ID: " + bid);
		}
	}

	public void searchAll() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayAll);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3) + " -- "
						+ rs.getString(4) + " -- " + rs.getFloat(5) + " -- " + rs.getString(6) + " -- "
						+ rs.getString(7) + " -- " + rs.getBoolean(8) + " -- " + rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteBook(int bid) {
		if (checkExistance(bid)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
				System.out.println("DB connection successful...........");
				PreparedStatement ps = con.prepareStatement(CC.delete);
				ps.setInt(1, bid);
				int result = ps.executeUpdate();
				if (result > 0)
					System.out.println("Record deleted succesfully for the given ID : " + bid);
				else
					System.out.println("Failed to delete" + bid);
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(bid + " doesnot exist");
		}
	}

	public void searchAuthorName(String aname) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			PreparedStatement ps = con.prepareStatement(CC.displayAuthor);
			ps.setString(1, aname);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3) + " -- "
						+ rs.getString(4) + " -- " + rs.getFloat(5) + " -- " + rs.getString(6) + " -- "
						+ rs.getString(7) + " -- " + rs.getBoolean(8) + " -- " + rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void searchBookByActive(String at) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			System.out.println("DB connection successful...........");
			PreparedStatement stmt = con.prepareStatement(CC.displayActive);
			stmt.setString(1, at);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3) + " -- "
						+ rs.getString(4) + " -- " + rs.getFloat(5) + " -- " + rs.getString(6) + " -- "
						+ rs.getString(7) + " -- " + rs.getBoolean(8) + " -- " + rs.getString(9));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void searchBookByItsStock(boolean isk) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			System.out.println("DB connection successful...........");
			PreparedStatement stmt = con.prepareStatement(CC.displayStock);
			stmt.setBoolean(1, isk);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3) + " -- "
						+ rs.getString(4) + " -- " + rs.getFloat(5) + " -- " + rs.getString(6) + " -- "
						+ rs.getString(7) + " -- " + rs.getBoolean(8) + " -- " + rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchBookByPriceInBetween(float pfrom, float top) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			System.out.println("DB connection successful...........");
			PreparedStatement stmt = con.prepareStatement(CC.displayByPrice);
			stmt.setFloat(1, pfrom);
			stmt.setFloat(2, top);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3) + " -- "
						+ rs.getString(4) + " -- " + rs.getFloat(5) + " -- " + rs.getString(6) + " -- "
						+ rs.getString(7) + " -- " + rs.getBoolean(8) + " -- " + rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchBookByCity(String cty) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			System.out.println("DB connection successful...........");
			PreparedStatement stmt = con.prepareStatement(CC.displayCity);
			stmt.setString(1, cty);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3) + " -- "
						+ rs.getString(4) + " -- " + rs.getFloat(5) + " -- " + rs.getString(6) + " -- "
						+ rs.getString(7) + " -- " + rs.getBoolean(8) + " -- " + rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
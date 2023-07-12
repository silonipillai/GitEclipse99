package com.sims.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	Connection con = null;

	public Connection getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "root");
			System.out.println("Connenction success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void registerBook(BookVO bvo) {
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.insertBookSQL);
			pstmt.setInt(1, bvo.getBookId());
			pstmt.setString(2, bvo.getBookName());
			pstmt.setInt(3, bvo.getPublishYear());
			pstmt.setString(4, bvo.getBookAuthor());
			pstmt.setFloat(5, bvo.getBookPrice());
			pstmt.setString(6, bvo.getCity());
			pstmt.setString(7, bvo.getGenere());
			pstmt.setBoolean(8, bvo.isInStock());
			pstmt.setString(9, bvo.getIsActive());
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Record inserted succesfully with given ID :" + bvo.getBookId());
			} else {
				System.out.println("Failed to register the book with ID :" + bvo.getBookId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BookVO> getListOfBooks() {
		ArrayList bookList = new ArrayList();
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.listOfBooksSQL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BookVO bvo = new BookVO();
				bvo.setBookId(rs.getInt(1));
				bvo.setBookName(rs.getString(2));
				bvo.setPublishYear(rs.getInt(3));
				bvo.setBookAuthor(rs.getString(4));
				bvo.setBookPrice(rs.getFloat(5));
				bvo.setCity(rs.getString(6));
				bvo.setGenere(rs.getString(7));
				bvo.setInStock(rs.getBoolean(8));
				bvo.setIsActive(rs.getString(9));

				bookList.add(bvo);
				// Collections.sort(bookList, new BookPublishYearComparator());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}

	public boolean checkForBookExistance(int bookId) {
		boolean flag = false;
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.BookBYIdSQL);
			pstmt.setInt(1, bookId);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public BookVO getBookById(int bookId) {
		BookVO bvo = new BookVO();
		boolean result = checkForBookExistance(bookId);
		if (result) {
			try {
				con = getDBConnection();
				PreparedStatement pstmt = con.prepareStatement(CC.BookBYIdSQL);
				pstmt.setInt(1, bookId);
				ResultSet rs = pstmt.executeQuery();
				System.out.println("Here are the book details you search for :");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3));
					bvo.setBookId(bookId);
					bvo.setBookName(rs.getString(2));
					bvo.setPublishYear(rs.getInt(3));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No Book found for the given ID :" + bookId);
		}
		return bvo;
	}

	public void getBookByAuthor(String authorName) {
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.BookBYAuthorSQL);
			pstmt.setString(1, authorName);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Here are the book details you search for :");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getAllBooksByActive(String isActive) {
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.BookBYActiveSQL);
			pstmt.setString(1, isActive);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Here are the book details you search for :");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getAllBooksByStock(int stockInput) {
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.BookBYStockSQL);
			pstmt.setInt(1, stockInput);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Here are the book details you search for :");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getAllBooksByPriceRange(int minPrice, int maxPrice) {
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.BookBYPriceRangeSQL);
			pstmt.setInt(1, minPrice);
			pstmt.setInt(2, maxPrice);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Here are the book details price in between :");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3) + "--" + rs.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteBookByItsID(int bookId) {
		boolean result = checkForBookExistance(bookId);
		if (result) {
			try {
				con = getDBConnection();
				PreparedStatement pstmt = con.prepareStatement(CC.DeleteBookIDSQL);
				pstmt.setInt(1, bookId);
				int i = pstmt.executeUpdate();
				if (i > 0) {
					System.out.println(i + " Recrod(s) deleted with ID :" + bookId + " Succesfully !!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No Book found with ID :" + bookId + " to Delete .");
		}
	}

	public void getBookByCity(String city) {
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.BookBYCitySQL);
			pstmt.setString(1, city);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Here are the book details you search for :");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void getBookByGenere(String genere) {
		try {
			con = getDBConnection();
			PreparedStatement pstmt = con.prepareStatement(CC.BookBYGenereSQL);
			pstmt.setString(1, genere);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Here are the book details you search for :");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package com.sims.action;

public class CC {

	public static final String BookBYIdSQL = "select * from book where BOOK_ID = ?";
	public static final String BookBYAuthorSQL = "select * from book where Author = ?";
	public static final String BookBYActiveSQL = "select * from book where IS_ACTIVE = ?";
	public static final String BookBYStockSQL = "select * from book where IN_STOCK = ?";
	public static final String BookBYPriceRangeSQL = "select * from book where BOOK_PRICE between ? and ?";
	public static final String DeleteBookIDSQL = "delete from book where BOOK_ID = ?";
	public static final String BookBYCitySQL = "select * from book where city = ?";
	public static final String BookBYGenereSQL = "select * from book where BOOK_GENERE = ?";
	public static final String insertBookSQL = "insert into book values(?,?,?,?,?,?,?,?,?)";
	public static final String listOfBooksSQL = "select * from book";

}

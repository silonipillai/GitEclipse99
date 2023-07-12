package com.smartims.cc;

public class CC {

	public static String insertQuery="insert into book values(?,?,?,?,?,?,?,?,?)";
	public static String display="select * from book where book_id=?";
	public static String displayAll="select * from book";
	public static String delete="delete from book where book_id=?";
	public static String displayAuthor="select * from book where book_author= ? ";
	public static String displayActive="select * from book where is_active=?";
	public static String displayStock="select * from book where in_stock= ? ";
	public static String displayByPrice="select * from book where book_price>=? and book_price<=?";
	public static String displayCity="select * from book where city= ? ";

}

package com.sims.action;

import java.util.ArrayList;

public class BookAction {
	BookDAO dao = new BookDAO();
	public ArrayList listOfBooks() {
		ArrayList<BookVO> bookList = dao.getListOfBooks();
		return bookList;
	}

	public BookVO getBookById(int bookId) {
		BookVO bvo = dao.getBookById(bookId);
		return bvo;
	}


}

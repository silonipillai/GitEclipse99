package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;
import com.smartims.vo.BookVO;

public class SearchBookAction {
	Scanner ip = new Scanner(System.in);
	BookVO bvo = new BookVO();

	void searchBook() {
		System.out.println("Searching Book by ID");
		System.out.println("Enter Book ID:");
		int bid=ip.nextInt();

		BookDAO bd = new BookDAO();
		bd.searchBook(bid);

	}

	public static void main(String[] args) {
		SearchBookAction sba = new SearchBookAction();
		sba.searchBook();
	}
}

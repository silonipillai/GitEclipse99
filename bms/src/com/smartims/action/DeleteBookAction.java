package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;

public class DeleteBookAction {
	Scanner ip = new Scanner(System.in);

	void removeBook() {
		System.out.println("Delete Book by ID...");
		System.out.println("Enter book ID:");
		int bid = ip.nextInt();

		BookDAO bd = new BookDAO();
		bd.deleteBook(bid);
	}

	public static void main(String[] args) {
		DeleteBookAction dba = new DeleteBookAction();
		dba.removeBook();
	}
}

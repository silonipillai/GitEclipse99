package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;

public class SearchAllBooksAction {
	Scanner ip = new Scanner(System.in);

	void displayAllBooks() {
		System.out.println("All the Book Records are......");

		BookDAO bd = new BookDAO();
		bd.searchAll();

	}

	public static void main(String[] args) {
		SearchAllBooksAction sab = new SearchAllBooksAction();
		sab.displayAllBooks();
	}
}

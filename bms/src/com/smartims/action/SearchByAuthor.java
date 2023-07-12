package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;

public class SearchByAuthor {
	Scanner ip = new Scanner(System.in);

	void searchAuthor() {
		System.out.println("Enter author name:");
		String aname = ip.next();

		BookDAO bd = new BookDAO();
		bd.searchAuthorName(aname);

	}

	public static void main(String[] args) {
		SearchByAuthor sb = new SearchByAuthor();
		sb.searchAuthor();
	}
}

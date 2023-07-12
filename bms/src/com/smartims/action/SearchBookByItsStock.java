package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;

public class SearchBookByItsStock {
	Scanner ip = new Scanner(System.in);

	void searchBookByItsStock() {
		System.out.println("Search by stock:");
		System.out.println("Enter stock:");
		boolean isk = ip.nextBoolean();

		BookDAO bd = new BookDAO();
		bd.searchBookByItsStock(isk);
	}

	public static void main(String[] args) {
		SearchBookByItsStock sbis = new SearchBookByItsStock();
		sbis.searchBookByItsStock();
	}

}

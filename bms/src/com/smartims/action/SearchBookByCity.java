package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;

public class SearchBookByCity {
	Scanner ip = new Scanner(System.in);

	void searchBookByCity() {
		System.out.println("Search by city:");
		String cty = ip.next();

		BookDAO bd = new BookDAO();
		bd.searchBookByCity(cty);
	}

	public static void main(String[] args) {
		SearchBookByCity sbc = new SearchBookByCity();
		sbc.searchBookByCity();
	}

}

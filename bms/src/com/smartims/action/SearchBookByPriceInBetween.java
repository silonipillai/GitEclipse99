package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;

public class SearchBookByPriceInBetween {
	Scanner ip = new Scanner(System.in);

	void searchBookByPriceInBetween() {
		System.out.println("Search by price:");
		System.out.println("Enter price from");
		float pfrom = ip.nextFloat();
		System.out.println("Enter to price:");
		float top = ip.nextFloat();

		BookDAO bd = new BookDAO();
		bd.searchBookByPriceInBetween(pfrom, top);
	}

	public static void main(String[] args) {
		SearchBookByPriceInBetween sbp = new SearchBookByPriceInBetween();
		sbp.searchBookByPriceInBetween();
	}

}

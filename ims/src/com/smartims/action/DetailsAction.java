package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.CustomerDAO;

public class DetailsAction {
	Scanner ip = new Scanner(System.in);

	void displayDetails() {
		System.out.println("===============================================================================================================");

		System.out.println("PERSONAL AUTO INSURANCE");
		System.out.println("Enter PolicyHolder ID :");
		int ph_id = ip.nextInt();

		CustomerDAO cdao = new CustomerDAO();
		cdao.displayDetails(ph_id);
	}

	public static void main(String[] args) {
		DetailsAction da = new DetailsAction();
		da.displayDetails();
	}
}

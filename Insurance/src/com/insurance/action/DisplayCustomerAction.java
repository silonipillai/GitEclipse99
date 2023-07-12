package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.CustomerDAO;

public class DisplayCustomerAction {
	Scanner ip = new Scanner(System.in);

	void displayById() {
		System.out.println("Enter Customer ID:");
		int cid = ip.nextInt();

		CustomerDAO pd = new CustomerDAO();
		pd.displayById(cid);
	}

	public static void main(String[] args) {
		DisplayCustomerAction dca = new DisplayCustomerAction();
		dca.displayById();
	}

}

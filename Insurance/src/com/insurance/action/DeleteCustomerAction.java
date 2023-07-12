package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.CustomerDAO;

public class DeleteCustomerAction {
	Scanner ip = new Scanner(System.in);

	void deleteAccount() {
		System.out.println("Delete Account");
		System.out.println("Enter Customer ID to Delete :");
		int cid = ip.nextInt();

		CustomerDAO cd = new CustomerDAO();
		cd.deleteCustomer(cid);
	}

	public static void main(String[] args) {
		DeleteCustomerAction dca = new DeleteCustomerAction();
		dca.deleteAccount();

	}

}

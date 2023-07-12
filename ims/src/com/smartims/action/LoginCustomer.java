package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.CustomerDAO;

public class LoginCustomer {
	Scanner ip = new Scanner(System.in);

	void login() {
		System.out.println("===============================================================================================================");

		System.out.println("Welcome Customer !!");
		System.out.println("Enter  ID :");
		int cus_id = ip.nextInt();
		System.out.println("Enter Password :");
		String password = ip.next();

		CustomerDAO cdao = new CustomerDAO();
		cdao.login(cus_id, password);
	}

	public static void main(String[] args) {
		LoginCustomer lc = new LoginCustomer();
		lc.login();
	}
}

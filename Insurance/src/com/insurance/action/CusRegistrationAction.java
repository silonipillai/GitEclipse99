package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.CustomerDAO;
import com.insurance.vo.CustomerVO;

public class CusRegistrationAction {
	Scanner ip = new Scanner(System.in);
	CustomerVO cvo=new CustomerVO();

	void registerCus() {
		System.out.println("Registering Customer:");
		System.out.println("Enter Details:");
		System.out.println("Enter the customer id:");
		cvo.setC_id(ip.nextInt());
		System.out.println("Enter customer name:");
		cvo.setC_name(ip.next());
		System.out.println("Enter email:");
		cvo.setC_email(ip.next());
		System.out.println("Enter phone no:");
		cvo.setC_phoneno(ip.nextLong());
		System.out.println("Enter gender:");
		cvo.setGender(ip.next());
		System.out.println("Enter age:");
		cvo.setAge(ip.nextInt());
		System.out.println("Marriage?");
		cvo.setMarriage_status(ip.nextBoolean());
		System.out.println("Policy ID:");
		cvo.setPolicy_id(ip.nextInt());

		CustomerDAO cd = new CustomerDAO();
		cd.insertRecord(cvo);

	}

	public static void main(String[] args) {
		CusRegistrationAction cra = new CusRegistrationAction();
		cra.registerCus();
	}
}

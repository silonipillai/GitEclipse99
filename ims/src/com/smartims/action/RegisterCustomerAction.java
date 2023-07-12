package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.CustomerDAO;
import com.smartims.vo.CustomerVO;

public class RegisterCustomerAction {
	Scanner ip = new Scanner(System.in);
	CustomerVO cvo=new CustomerVO();
void registerCustomer() {
	System.out.println("===============================================================================================================");

	System.out.println("PLease Enter Customer Details :");
	System.out.println("Enter Name :");
	cvo.setCus_name(ip.next());
	
	System.out.println("Enter Email :");
	cvo.setCus_email(ip.next());
	
	System.out.println("Enter Phone Number :");
	cvo.setCus_phone(ip.nextLong());

	System.out.println("Enter Password :");
	cvo.setPassword(ip.next());
	
	CustomerDAO cdao=new CustomerDAO();
	cdao.insertCustomer(cvo);
}
public static void main(String[] args) {
	RegisterCustomerAction rca=new RegisterCustomerAction();
	rca.registerCustomer();
}
}

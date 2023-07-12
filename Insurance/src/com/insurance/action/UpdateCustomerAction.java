package com.insurance.action;

import java.util.Scanner;

import com.insurance.dao.CustomerDAO;
import com.insurance.vo.CustomerVO;

public class UpdateCustomerAction {
	CustomerDAO cdao=new CustomerDAO();
	Scanner ip = new Scanner(System.in);
	CustomerVO cvo =new CustomerVO();
	void updateCustomer() {
		System.out.println("Enter the Customer ID:");
		int cid=ip.nextInt();
		
		System.out.println("Enter what needs to be updated :");
		System.out.println(
				"1.Name -- 2.Email -- 3.PhoneNumber -- 4.Gender -- "
				+ "5.Age -- 6.Marriage Status -- 7.Policy ID");
		int cus = ip.nextInt();
		switch (cus) {
		case 1:
			System.out.println("Update Name :");
			System.out.println("Enter New Name :");
			String name = ip.next();
			cdao.updateName(cid,name);
			
			break;
			
		case 2:
			System.out.println("Update Email :");
			System.out.println("Enter New Email :");
			String email = ip.next();
			cdao.updateMail(cid,email);
			break;
		case 3:
			System.out.println("Update Phone Number :");
			System.out.println("Enter New Phone Number :");
			long phn = ip.nextLong();
			cdao.updatePhone(cid,phn);
			break;
		case 4:
			System.out.println("Update Gender :");
			System.out.println("Enter Gender :");
			String gender = ip.next();
			cdao.updateGender(cid,gender);
			break;
		case 5:
			System.out.println("Update Age :");
			System.out.println("Enter New Age :");
			int age = ip.nextInt();
			cdao.updateAge(cid,age);
			break;
		case 6:
			System.out.println("Update Marriage Status :");
			System.out.println("Enter Status :");
			boolean mrrg = ip.nextBoolean();
			cdao.updateMarriage(cid,mrrg);
			break;
		case 7:
			System.out.println("Update Policy ID :");
			System.out.println("Enter New Policy ID :");
			int pid = ip.nextInt();
			cdao.updatePolicyid(cid,pid);
			break;
		default:
			System.out.println("Invalid input...");
		}
		
	}

	public static void main(String[] args) {
		UpdateCustomerAction uca = new UpdateCustomerAction();
		uca.updateCustomer();
	}
}

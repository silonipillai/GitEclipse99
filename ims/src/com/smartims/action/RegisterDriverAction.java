package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.DriverDAO;
import com.smartims.vo.DriverVO;

public class RegisterDriverAction {
	Scanner ip = new Scanner(System.in);
	DriverVO dvo = new DriverVO();

	void registerDriver() {
		System.out.println("===============================================================================================================");

		System.out.println("Please Enter Driver Details :");
		System.out.println("Enter Driver Name :");
		dvo.setDname(ip.next());

		System.out.println("Enter Age :");
		dvo.setAge(ip.nextInt());

		System.out.println("Enter Driving Experience :");
		dvo.setExp(ip.nextInt());

		System.out.println("Enter Driver History :");
		dvo.setDhistory(ip.next());

		System.out.println("Enter License Number :");
		dvo.setLicense_num(ip.nextInt());

		System.out.println("Enter VIN :");
		dvo.setVin(ip.next());

		System.out.println("Enter Policy Holder ID :");
		dvo.setPh_id(ip.nextInt());

		DriverDAO ddao = new DriverDAO();
		ddao.registerDriver(dvo);
		
        System.out.println("Do you want to add another Driver Enter y/n");
		String option=ip.next();
		if(option.equalsIgnoreCase("y")) {
			this.registerDriver();
		}
		else {
			System.out.println("Thank You For Adding Driver Details!!!");
		}
	}
	public static void main(String[] args) {
		RegisterDriverAction rda=new RegisterDriverAction();
		rda.registerDriver();
	}
}

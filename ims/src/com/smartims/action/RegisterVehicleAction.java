package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.VehicleDAO;
import com.smartims.vo.VehicleVO;

public class RegisterVehicleAction {
	Scanner ip = new Scanner(System.in);
	VehicleVO vvo = new VehicleVO();

	public void insertVehicle() {
		System.out.println("===============================================================================================================");

		System.out.println("Please Enter Vehicle Details :");
		System.out.println("Enter VIN :");
		vvo.setVin(ip.next());

		System.out.println("Enter City :");
		vvo.setCity(ip.next());

		System.out.println("Enter Vehicle Company :");
		vvo.setCompany(ip.next());

		System.out.println("Enter Vehicle Model :");
		vvo.setModel(ip.next());

		System.out.println("Enter Fuel Type :");
		vvo.setFuel(ip.next());

		System.out.println("Enter CC :");
		vvo.setCc(ip.nextInt());

		System.out.println("Enter Age of Vehicle :");
		vvo.setReg_yr(ip.nextInt());

		System.out.println("Enter Type of Vehicle(two or four wheeler) :");
		vvo.setType(ip.next());

		System.out.println("Enter Your PolicyHolder ID :");
		vvo.setPh_id(ip.nextInt());

		VehicleDAO vdao = new VehicleDAO();
		vdao.insertVehicle(vvo);
		
		System.out.println("Do you want to add another Vehicle Enter y/n");
		String option=ip.next();
		if(option.equalsIgnoreCase("y")) {
			this.insertVehicle();
		}
		else {
			System.out.println("Thank You For Adding Vehicle Details!!!");
		}
		
	}

	public static void main(String[] args) {
		RegisterVehicleAction rva = new RegisterVehicleAction();
		rva.insertVehicle();

	}

}

package com.smartims.action;

public class CommonDAO {
	DBUtil db = new DBUtil();

	void printScreenValues(PersonVO pvo, VehicleVO vvo) {
		String result = db.connectTODB("oracle");
		if (result.equalsIgnoreCase("success")) {

			System.out.println("Customer details.....");

			System.out.println("Id:" + pvo.getId());
			System.out.println("Name:" + pvo.getName());
			System.out.println("Age:" + pvo.getAge());
			System.out.println("Address:" + pvo.getAddress());
			System.out.println("City:" + pvo.getCity());
			System.out.println("Salary:" + pvo.getSalary());

			System.out.println("_____________________");
			System.out.println("Customer purchased vehicle details.. ");
			System.out.println("Model no:" + vvo.getModelno());
			System.out.println("Company:" + vvo.getCompany());
			System.out.println("Registered name:" + vvo.getRname());
			System.out.println("Number plate:" + vvo.getNumplate());

		} else {
			System.out.println("DB name invalid,Unable to connect.");
		}
	}

}

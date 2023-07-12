package com.smartims.action;

import java.util.Scanner;

public class RegistrationAction {
	Scanner sc = new Scanner(System.in);
	PersonVO pvo = new PersonVO();

	void insertRecord() {
		System.out.println("Enter details.......");
		System.out.println("Id:");
		pvo.setId(sc.nextInt());
		System.out.println("Enter Name:");
		pvo.setName(sc.next());
		System.out.println("Enter Address:");
		pvo.setAddress(sc.next());
		System.out.println("Enter City:");
		pvo.setCity(sc.next());
		System.out.println("Enter Salary:");
		pvo.setSalary(sc.nextFloat());
		System.out.println("Enter Age:");
		pvo.setAge(sc.nextInt());

		DBUtil1 db = new DBUtil1();
		db.insertEmpRecord(pvo);
	}

	void deleteEmpRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id to Delete:");
		int empId = sc.nextInt();
		DBUtil1 db = new DBUtil1();
		db.deleteRecord(empId);
	}

	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to display:");
		int empId = sc.nextInt();
		DBUtil1 db = new DBUtil1();
		db.selectRecord(empId);
	}

	void displayAll() {
		DBUtil1 db = new DBUtil1();
		db.retriveRecord();
	}

	public static void main(String[] args) {
		RegistrationAction ra = new RegistrationAction();
		// ra.insertRecord();
		// ra.deleteEmpRecord();
		// ra.display();
		ra.displayAll();
	}
}

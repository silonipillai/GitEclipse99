package com.smartims.action;

import java.util.Scanner;

public class DeleteEmpAction {

	void deleteRecord() {
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		
		DBUtil1 db = new DBUtil1();
		db.deleteRecord(empId);
	}

}

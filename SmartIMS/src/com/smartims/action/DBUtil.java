package com.smartims.action;

public class DBUtil {
	String result;

	String connectTODB(String dbName) {
		if (dbName.equalsIgnoreCase("oracle")) {
			System.out.println("Oracle Connection established....");
			result = "success";
		} else {
			System.out.println("DB name invalid,Unable to connect.");
			result = "fail";
		}
		return result;
	}
}

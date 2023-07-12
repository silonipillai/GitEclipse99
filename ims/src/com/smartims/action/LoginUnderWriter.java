package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.UnderWriterDAO;
import com.smartims.vo.UnderWriterVO;

public class LoginUnderWriter {
	Scanner ip = new Scanner(System.in);
	UnderWriterVO uvo = new UnderWriterVO();

	void loginUnderWriter() {
		System.out.println("===============================================================================================================");

		System.out.println("Welcome !!");
		System.out.println("Enter UnderWriter ID :");
		int uw_id = ip.nextInt();
		System.out.println("Enter Password :");
		String password = ip.next();

		UnderWriterDAO udao = new UnderWriterDAO();
		udao.login(uw_id, password);
	}

	public static void main(String[] args) {
		LoginUnderWriter luw = new LoginUnderWriter();
		luw.loginUnderWriter();
	}
}

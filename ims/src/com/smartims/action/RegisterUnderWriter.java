package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.UnderWriterDAO;
import com.smartims.vo.UnderWriterVO;

public class RegisterUnderWriter {
	Scanner ip = new Scanner(System.in);
	UnderWriterVO uvo = new UnderWriterVO();

	void registerUnderWriter() {
		System.out.println("===============================================================================================================");

		System.out.println("Register Under Writer :");
		System.out.println("Enter Name :");
		uvo.setUw_name(ip.next());
		System.out.println("Enter Email :");
		uvo.setUw_email(ip.next());
		System.out.println("Enter Password :");
		uvo.setPassword(ip.next());

		UnderWriterDAO udao = new UnderWriterDAO();
		udao.insertUnderWriter(uvo);

	}

	public static void main(String[] args) {
		RegisterUnderWriter ruw = new RegisterUnderWriter();
		ruw.registerUnderWriter();
	}
}

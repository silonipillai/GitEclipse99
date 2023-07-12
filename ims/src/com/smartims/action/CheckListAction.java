package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.UnderWriterDAO;

public class CheckListAction {
	Scanner ip = new Scanner(System.in);

	void checkList() {
		System.out.println("====================================================================================================================");
		System.out.println("Enter PolicyHolder ID : ");
		int ph_id = ip.nextInt();

		UnderWriterDAO uwdao = new UnderWriterDAO();
		uwdao.checkList(ph_id);
	}

	public static void main(String[] args) {
		CheckListAction cla = new CheckListAction();
		cla.checkList();
	}
}

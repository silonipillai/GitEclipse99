package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;
import com.smartims.vo.BookVO;

public class RegisterBookAction {
	Scanner ip = new Scanner(System.in);
	BookVO bvo = new BookVO();

	void insertRecord() {
		System.out.println("Register Book .......");
		System.out.println(" Enter Book ID:");
		bvo.setBookId(ip.nextInt());
		System.out.println("Enter Book Name:");
		bvo.setBookName(ip.next());
		System.out.println("Enter Published Year");
		bvo.setPublishYear(ip.nextInt());
		System.out.println("Enter Book Author");
		bvo.setBookAuthor(ip.next());
		System.out.println("Enter Book Price:");
		bvo.setBookPrice(ip.nextFloat());
		System.out.println("Enter City:");
		bvo.setCity(ip.next());
		System.out.println("Enter Genere:");
		bvo.setGenere(ip.next());
		System.out.println("Enter In Stock:");
		bvo.setInStock(ip.nextBoolean());
		System.out.println("Enter whether Active:");
		bvo.setIsActive(ip.next());

		BookDAO bd = new BookDAO();
		bd.insertBook(bvo);
	}

	public static void main(String[] args) {

		RegisterBookAction rba = new RegisterBookAction();
		rba.insertRecord();
	}
}

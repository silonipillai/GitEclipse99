package com.smartims.action;

import java.util.Scanner;

import com.smartims.dao.BookDAO;

public class SearchBookByActive {
Scanner ip=new Scanner(System.in);
void searchActive(){
	System.out.println("Search By Active:");
	System.out.println("Enter Active:");
	String at=ip.next();
	
	BookDAO bd=new BookDAO();
	bd.searchBookByActive(at);
}
public static void main(String[] args) {
	SearchBookByActive sba=new SearchBookByActive();
	sba.searchActive();
}
}

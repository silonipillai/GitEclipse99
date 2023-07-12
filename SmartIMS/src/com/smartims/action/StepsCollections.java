package com.smartims.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.TreeSet;

public class StepsCollections {
public void connectToDB() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from staff");
		TreeSet stafflist=new TreeSet();
	    while(rs.next()) {
	    	stafflist.add(rs.getString(2));
	    }
	    Iterator itr=stafflist.iterator();
	    while(itr.hasNext()) {
	    	System.out.println();
	    }
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
public static void main(String[] args) {
	StepsCollections sc=new StepsCollections();
	sc.connectToDB();
}
}

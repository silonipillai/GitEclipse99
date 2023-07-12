package com.smartims.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.TreeSet;

public class MySQLConnection {
	public void connectToDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
			System.out.println("DB connection successful...........");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from actor where actor_id<=100;");
			TreeSet actorNameList=new TreeSet();
			
			
			while (rs.next()) {
				actorNameList.add(rs.getString(2));
				//we can not add two cols cause array can contain only single type of data
				//actorNameList.add(rs.getInt(1));
				//System.out.println(rs.getInt(1)+" --  "+rs.getString(2)+" -- "+rs.getTimestamp(11));
                }
			Iterator itr = actorNameList.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			//System.out.println(actorNameList);
			con.close();
		} 
		
	catch (Exception e) {
		// TODO: handle exception
	}
}
	public static void main(String[] args) {
		MySQLConnection m=new MySQLConnection();
		m.connectToDB();
	}
}

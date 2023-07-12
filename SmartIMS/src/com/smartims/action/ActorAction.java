package com.smartims.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ActorAction {
ActorVO aa=new ActorVO();
public void connectToDB() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
		System.out.println("DB connection successful...........");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select actor_id,first_name,last_update from actor where actor_id<=10;");
		ArrayList actorNameList=new ArrayList();
		
		
		while (rs.next()) {
			ActorVO a=new ActorVO();
			a.setActor_id(rs.getInt(1));
			a.setFirst_name(rs.getString(2));
			a.setLast_update(rs.getTimestamp(3));
			actorNameList.add(a);
			
			    }
		Iterator itr = actorNameList.iterator();
		while(itr.hasNext())
		{
			ActorVO a=(ActorVO)itr.next();
			System.out.println(a.getActor_id()+" -- "+a.first_name+" -- "+a.getLast_update());
		}
		
		con.close();
	} 
	
catch (Exception e) {
	// TODO: handle exception
}
}
public static void main(String[] args) {
	ActorAction aa=new ActorAction();
	aa.connectToDB();
}
}

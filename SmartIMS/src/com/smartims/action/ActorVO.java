package com.smartims.action;

import java.sql.Date;
//import java.sql.Timestamp;
import java.sql.Timestamp;

public class ActorVO {
	int actor_id;
	String first_name;
	Timestamp last_update;
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Timestamp getLast_update() {
		return last_update;
	}
	public void setLast_update(Timestamp timestamp) {
		this.last_update = timestamp;
	}

	
	
}

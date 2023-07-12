package com.smartims.cc;

public class CC {
	//Agent
	public static String insertAgent="insert into agent (agent_name ,agent_email,password )values(?,?,?)";
	public static String displayAgent="select * from agent where agent_id=? && password=?";
	//Customer
	public static String insertCustomer="insert into customer (cus_name,cus_email,cus_phone,password) values (?,?,?,?)";
	public static String displayCustomer="select * from customer where cus_id=? && password=?";
	public static String displayDetails="select policyholder.*,driver.*,vehicle.* from policyholder inner join driver on policyholder.ph_id=driver.ph_id inner join vehicle on policyholder.ph_id=vehicle.ph_id where policyholder.ph_id=?";
	//UW
	public static String insertUnderWriter="insert into underwriter (uw_name ,uw_email,password )values(?,?,?)";
	public static String displayUnderWriter="select * from underwriter where uw_id=? && password=?";
	public static String userIdSql="select cus_id from customer";
	public static String displayIssue="select policyholder.address,driver.exp,vehicle.cc,vehicle.reg_yr,vehicle.city from policyholder inner join driver on policyholder.ph_id=driver.ph_id inner join vehicle on policyholder.ph_id=vehicle.ph_id where policyholder.ph_id=?";
	public static String displayIssues1="select exp from driver where ph_id=?";
	public static String displayIssues2="select reg_yr from vehicle where ph_id=?";
	
	//policyholder
	public static String insertPolicyHolder="insert into policyholder (ph_name,phonenum,age,address)values(?,?,?,?);";
	//vehicle
	public static String insertVehicle="insert into vehicle values(?,?,?,?,?,?,?,?,?)";
	//driver
	public static String insertDriver="insert driver (dname,age,exp,dhistory,license_num,vin,ph_id)values (?,?,?,?,?,?,?)";
	//policy
	public static String insertPolicy="insert into policy (ph_id,term,bodily_injury,property_damage,collision,comprehensive,medical)values (?,?,?,?,?,?,?)";
	public static String displayPolicies="select * from policy";
	public static String updateStatus="update policy set status=? where policy_id=?";
	public static String displayBI="select bodily_injury,property_damage,collision,comprehensive,medical from policy where bodily_injury=true and policy_id=?";
	
	

	
}

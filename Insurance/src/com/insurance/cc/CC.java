package com.insurance.cc;

public class CC {
	//customer
	public static String insertQuery="insert into customer values(?,?,?,?,?,?,?,?)";
	public static String displayCus="select * from customer where c_id=?";
	public static String displayAll="select * from customer";
	public static String deleteCus="delete from customer where c_id=?";
	//customer update
	public static String updateMail="update customer set c_email=? where c_id=?";
	public static String updateName="update customer set c_name=? where c_id=?";
	public static String updatePhone="update customer set c_phoneno=? where c_id=?";
	public static String updateGender="update customer set gender=? where c_id=?";
	public static String updatePolicy="update customer set policy_id=? where c_id=?";
	public static String updateMarriage="update customer set marriage_status=? where c_id=?";
	public static String updateAge="update customer set age=? where c_id=?";
	
	//policy
	public static String insertPolicy="insert into policy values(?,?,?,?,?)";
	public static String displayPolicy="select * from policy where policy_id=?";
	public static String displayAllPolicy="select * from policy";
	//payment
	public static String insertPayment="insert into payment values(?,?,?,?)";
	public static String selectPayment="select * from payment where c_id=?";
	public static String selectPaymentDetails="select customer.c_name,customer.c_phoneno,customer.policy_id ,payment.c_id,payment.premium from customer,payment where payment.c_id=customer.c_id";
	
	
}

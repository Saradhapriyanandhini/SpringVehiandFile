package org.vehiclemanagement.model;

import java.io.Serializable;


public class Order implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String order_No;
	private String order_Name;
	private String user_Name;
	private String mobile_No;
	private String Place;
	public Order(String order_No, String order_Name, String user_Name, String mobile_No, String place) {
		
		this.order_No = order_No;
		this.order_Name = order_Name;
		this.user_Name = user_Name;
		this.mobile_No = mobile_No;
		Place = place;
	}
	
	public Order() {}
	@Override
	public String toString() {
		return "Order [order_No=" + order_No + ", order_Name=" + order_Name + ", user_Name=" + user_Name
				+ ", mobile_No=" + mobile_No + ", Place=" + Place + "]";
	}
	
	public String getOrder_Name() {
		return order_Name;
	}
	public void setOrder_Name(String order_Name) {
		this.order_Name = order_Name;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	
	
	
	public String getOrder_No() {
		return order_No;
	}
	
	public void setOrder_No(String order_No) {
		this.order_No = order_No;
	}
	public String getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}

}

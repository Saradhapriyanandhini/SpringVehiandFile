package com.infotech.model;

import org.apache.commons.lang3.StringUtils;

public class FileModel {
	
	
	private String order_No;
	private String order_Name;
	private String user_Name;
	private String mobile_No;
	private String Place;
	public String getOrder_No() {
		return order_No;
	}
	public void setOrder_No(String order_No) {
		order_No=StringUtils.rightPad(order_No, TextEnum.ORDERNO.getEnd()-TextEnum.ORDERNO.getStart(), " ");
		this.order_No = order_No;
	}
	public String getOrder_Name() {
		return order_Name;
	}
	public void setOrder_Name(String order_Name) {
		order_Name=StringUtils.rightPad(order_Name, TextEnum.ORDERNAME.getEnd()-TextEnum.ORDERNAME.getStart(), " ");
		this.order_Name = order_Name;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		user_Name=StringUtils.rightPad(user_Name, TextEnum.USERNAME.getEnd()-TextEnum.USERNAME.getStart(), " ");
		this.user_Name = user_Name;
	}
	public String getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		mobile_No=StringUtils.rightPad(mobile_No, TextEnum.MOBILENO.getEnd()-TextEnum.MOBILENO.getStart(), " ");
		this.mobile_No = mobile_No;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		place=StringUtils.rightPad(place, TextEnum.PLACE.getEnd()-TextEnum.PLACE.getStart(), " ");
		Place = place;
	}@Override
	public String toString() {
		return "FileModel [order_No=" + order_No + ", order_Name=" + order_Name + ", user_Name=" + user_Name
				+ ", mobile_No=" + mobile_No + ", Place=" + Place + "]";
	}
}

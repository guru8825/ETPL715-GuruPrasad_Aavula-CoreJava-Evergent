package com.evergent.corejava.exception;

public class StudentBean {
	private int sno;
	private String sname;
	private String address;
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setName(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	//retreiving all values using toString();
	public String toString() {
		return "Student no: "+sno+"\nStudent Name: "+sname+"\nStudent Address: "+address;
	}
}
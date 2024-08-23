package com.evergent.corejava.exception;

import java.io.Serializable;
public class EmployeeBean implements Serializable{
	//private fields
	private int eno;
	private String ename;
	private double sal;
	//setter methods and getter methods
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getEno() {
		return eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getEname() {
		return ename;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getSal() {
		return sal;
	}
}
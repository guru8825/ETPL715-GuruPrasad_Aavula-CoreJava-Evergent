package com.evergent.corejava.exception;
//implementing Employee bean
public class EmployeeBeanImpl {
	public static void main(String[] args) {
		// Store the values to Bean
		EmployeeBean emp=new EmployeeBean();
		emp.setEno(101);
		emp.setEname("Ram");
		emp.setSal(55500);
		
		//Retrieve values from Bean
		System.out.println("Employee No: "+emp.getEno());
		System.out.println("Employee Name: "+emp.getEname());
		System.out.println("Employee Salaray: "+emp.getSal());
	}
}
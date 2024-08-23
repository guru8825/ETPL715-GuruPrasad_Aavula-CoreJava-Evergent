package com.evergent.corejava.exception;
public class StudentBeanImpl {
	public static void main(String[] args) {
		StudentBean stu=new StudentBean();
		stu.setSno(100);
		stu.setName("Kumar");
		stu.setAddress("nanakramguda");
		
		System.out.println(stu);
	}
}
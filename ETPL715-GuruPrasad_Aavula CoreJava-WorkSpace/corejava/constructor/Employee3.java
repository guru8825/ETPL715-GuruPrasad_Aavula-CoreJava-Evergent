package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default Constructor");
	}
	//initialization of current class objects using constructor
	Employee3(int eno,String ename,double sal){
		
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		}
	public void display() {
		System.out.println("Employee no : "+eno);
		System.out.println("Employee name : "+ename);
		System.out.println("Salari : "+sal);
	}
	

	public static void main(String[] args) {
		new Employee3();
		Employee3 emp=new Employee3(123,"ravi",5500);
		emp.display();

	}


}

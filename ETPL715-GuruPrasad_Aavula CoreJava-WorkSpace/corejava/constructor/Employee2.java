package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("Default Constructor");
	}
	//parameterized Constructor
	Employee2(int eno1,String ename1,double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
		}
	public void display() {
		System.out.println("Employee no : "+eno);
		System.out.println("Employee name : "+ename);
		System.out.println("Salary : "+sal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee2();
		//accessing Construtor while creation of object
		//using Constructor initializing the object
		Employee2 emp=new Employee2(123,"ravi",5500);
		emp.display();

	}

}

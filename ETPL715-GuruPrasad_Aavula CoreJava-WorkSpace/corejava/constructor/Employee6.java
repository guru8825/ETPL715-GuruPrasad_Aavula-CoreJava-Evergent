package com.evergent.corejava.constructor;
class MyEmployee{
	int eno;
	MyEmployee(){}
	MyEmployee(int eno){
		System.out.println("Employee number11 Super class "+eno);//123
	}
}

public class Employee6 extends MyEmployee{
	int eno;
	String ename;
	double sal;
   public Employee6() {
		System.out.println("Default Construtor");
	}
 public Employee6(int eno,String ename,double sal) {
		super(eno);
		//The super keyword can  be used to invoke the parent class constructor
//  refers to the the immediate super class constructor with eno as only parameter
		System.out.println("Employee number1:"+eno);//123
		// the scope of the value of eno is upto this constructor itself
		this.ename=ename;
		this.sal=sal;
	}
public void display() {
	System.out.println("Employee number2:"+eno);//0
	System.out.println("Employee ename:"+ename);//ram
	System.out.println("Employee salary:"+sal);//55666.0
}
	public static void main(String[] args) {
		new Employee6();
		//new MyEmployee(222);
		Employee6 emp6=new Employee6(123,"ram",55666);
		emp6.display();
	}

}

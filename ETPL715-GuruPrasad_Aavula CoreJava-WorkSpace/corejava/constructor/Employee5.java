
package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double sal;
	Employee5(){
		System.out.println("Default");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal){
		//calling another constructor using this keyword
		this(eno);
		this.ename=ename;
		this.sal=sal;
		
	}
	public void display() {
		System.out.println("Employee no"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee sal:"+sal);
	}
	public static void main(String args[]) {
		new Employee5();
		Employee5 emp5=new Employee5(123,"raj",55000);
		emp5.display();
	}

}

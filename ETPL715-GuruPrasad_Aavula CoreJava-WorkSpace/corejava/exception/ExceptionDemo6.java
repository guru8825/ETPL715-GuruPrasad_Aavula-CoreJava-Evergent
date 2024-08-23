package com.evergent.corejava.exception;

public class ExceptionDemo6 {
	String name="name";
	int k=2;
	//xi.Try followed by either catch block or finally block.
	//only try gives error atleast one to be there
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("One");
		}
		finally {
			System.out.println("It is a finally block for closing connection");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 ed6=new ExceptionDemo6();
		ed6.myData();
	}
}

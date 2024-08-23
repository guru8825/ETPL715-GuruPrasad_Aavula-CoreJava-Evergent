package com.evergent.corejava.exception;

public class ExceptionDemo8throws {
	String name=null;
	//Using throws an Exception can be executed method by method
	public void myData()throws NullPointerException{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}
	public void myInfo()  {
		myData();
		System.out.println("My Info Methods");
	}
	public static void main(String[] args)  {
		
		try {
			ExceptionDemo8throws ed8=new ExceptionDemo8throws();
			ed8.myInfo();
		}
		catch(Exception e) {
			System.out.println("I can handle"+e);
		}
	}
}

package com.evergent.corejava.exception;
//
public class ExceptionDemo7 {
	String name=null;
	//Using throws an Exception can be executed .
	int k=2;
	public void myData( )throws NullPointerException {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
	public static void main(String[] args) {
		try {
			ExceptionDemo7 ed7=new ExceptionDemo7();
			ed7.myData();
		}
		catch (NullPointerException e) {
			System.out.println("I can handle this"+e);
		}

	}

}

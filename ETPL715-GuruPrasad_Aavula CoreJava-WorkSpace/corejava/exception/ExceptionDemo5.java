package com.evergent.corejava.exception;
//ix.Finally is a block,irrespective of the Exception finally block is executed.
public class ExceptionDemo5 {
	String name="name";
	int k=2;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("One");
		}
		catch(NullPointerException e) {
			System.out.println("I can Handle"+e);
		}
	catch(ArithmeticException e) {
		System.out.println("I can Handle"+e);
		}
	catch(Exception e) {
		System.out.println("I can Handle"+e);
		}	
		finally {
			System.out.println("It is a finally block");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed5=new ExceptionDemo5();
		ed5.myData();
	}
}

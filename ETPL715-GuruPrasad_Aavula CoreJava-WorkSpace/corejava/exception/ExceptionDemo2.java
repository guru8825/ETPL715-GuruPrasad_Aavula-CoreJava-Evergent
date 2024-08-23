package com.evergent.corejava.exception;
/*iii.All Exceptions are executed in case of any abnormal conditions.
In case of Normal flow Exceptions are not executed.*/
public class ExceptionDemo2 {
	String name="null";
	
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
			
		}
		catch(NullPointerException e) {
			System.out.print(e);
		}
	}

	public static void main(String[] args) {
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
	}

}

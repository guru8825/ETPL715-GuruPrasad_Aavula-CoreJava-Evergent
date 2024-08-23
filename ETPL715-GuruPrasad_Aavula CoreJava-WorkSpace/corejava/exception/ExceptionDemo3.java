package com.evergent.corejava.exception;
/*xiv.If there are two Exceptions in our try block,Developer should 
 * handle 1st exception then after only 2nd exception is handled.*/
public class ExceptionDemo3 {
String name=null;
int k=0;
public void myData() {
	try {
		System.out.println("One");
		System.out.println(name.length());
		System.out.println(10/k);
		System.out.println("One");
	}
	catch(NullPointerException e) {
		System.out.println("I can Handle"+e);
	}
catch(ArithmeticException e) {
	System.out.println("I can Handle"+e);
	}
	
}
	public static void main(String[] args) {
		ExceptionDemo3 ed3=new ExceptionDemo3();
		ed3.myData();

	}

}

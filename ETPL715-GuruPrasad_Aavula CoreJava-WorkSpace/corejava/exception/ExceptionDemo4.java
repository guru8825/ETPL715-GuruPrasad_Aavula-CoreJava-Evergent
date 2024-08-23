package com.evergent.corejava.exception;

public class ExceptionDemo4 {
	//xii.We should follow Exception hierarchical.
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
		}
		public static void main(String[] args) {
			ExceptionDemo3 ed3=new ExceptionDemo3();
				ed3.myData();	
		}
	}



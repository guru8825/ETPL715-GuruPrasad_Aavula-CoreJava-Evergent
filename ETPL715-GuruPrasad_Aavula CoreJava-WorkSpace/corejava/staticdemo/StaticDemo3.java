package com.evergent.corejava.staticdemo;

public class StaticDemo3 {
	static String cname="India";
	String name ="Ramesh";//non-static variable
	static public void myData() {
		System.out.println("myData");
		//show() //cannot access static methods in non static
	}
	public void show() {
		System.out.println("show is non-static method");
		myData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(cname);
		
		

	}

}

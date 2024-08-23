package com.evergent.corejava.staticdemo;

public class StaticDemo4 {
	static String cname="India";
	String name ="Ramesh";//non-static variable
	static public void myData() {
		System.out.println("myData");
		//show() //cannot access static methods in non static
	}
	public void show() {
		myData();//static methods and variables can be accessed in non-static methods
		System.out.println(cname);
		System.out.println("show is non-static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myData();
		
		StaticDemo4 sd4=new StaticDemo4();
		sd4.show();

	}

}

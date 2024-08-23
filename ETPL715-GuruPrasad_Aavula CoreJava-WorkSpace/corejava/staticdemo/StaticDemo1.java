package com.evergent.corejava.staticdemo;
//static is a keyword 
//can declare variables and methods as static
public class StaticDemo1 {
	static String cname="India";
	static public void myData() {
		System.out.println("myData");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();
		//static variables can be accessed directly 
		System.out.println(cname);
		System.out.println(StaticDemo1.cname);
		//The above two lines are same can access in both ways
		//The below two lines are same
		myData();
		StaticDemo1.myData();
		//static methods accessed directly in static method


	}

}

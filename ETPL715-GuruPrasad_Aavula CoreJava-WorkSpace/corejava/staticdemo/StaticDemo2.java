package com.evergent.corejava.staticdemo;
//static methods can access only static methods and static variables directly
public class StaticDemo2 {
	static String cname="India";//static variable//class varible
	String name ="Ramesh";//non-static variable
	static public void myData() {
		System.out.println("myData");
	}
	public void show() {
		System.out.println("show is non-static method");
	}
	public static void main(String[] args) {
		//unable to access non static variable in static method
		//System.out.print(name);
		//show();
		// Cannot make a static reference to the non-static method show() 
		//from the type StaticDemo2
		myData();//can access static in static
		System.out.println(cname);
		
	}

}

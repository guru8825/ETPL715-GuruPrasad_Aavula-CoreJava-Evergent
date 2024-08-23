package com.evergent.corejava.staticdemo;

public class StaticDemo5 {
	static String cname="India";
	// In a program if static block is presents it is executed first
	static {
		System.out.println("Static Block");
	}
	static public void myData() {
		System.out.print("Mydata");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
		

	}

}

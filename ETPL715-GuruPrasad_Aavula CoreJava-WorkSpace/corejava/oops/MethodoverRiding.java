package com.evergent.corejava.oops;


class BigData{
	public void myData() {
		System.out.println("BigData:classmethod");
	}
}
public class MethodoverRiding extends BigData {
	public void myData() {
		System.out.println("myData");
		
	}
	
	public void show() {
		System.out.println("Local show method");
//using super keyword to access the super class method 
		//which overided by subclass method
		super.myData();
	}
	
	

	public static void main(String[] args) {
		MethodoverRiding  mr=new MethodoverRiding();
	
		mr.show();
		mr.myData();
		

	}

}

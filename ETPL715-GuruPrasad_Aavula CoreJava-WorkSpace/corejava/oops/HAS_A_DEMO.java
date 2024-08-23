package com.evergent.corejava.oops;

public class HAS_A_DEMO {
	public void myData() {
		show();
		System.out.println("HAS_A MYDATA");
	}
	public void show() {
		System.out.println("HAS_A MYDATA");
	}

	public static void main(String[] args) {
		HAS_A_DEMO has=new HAS_A_DEMO();
		has.myData();
		//Whenever an instance of one class is used in another class, 
		//it is called HAS-A relationship
		Person person=new Person();
		person.display();

	}

}

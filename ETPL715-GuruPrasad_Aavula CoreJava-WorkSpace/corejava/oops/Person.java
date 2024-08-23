package com.evergent.corejava.oops;

public class Person {
	String name="guru";
	int age=22;
	String address="Hyd";
	public void display() {
		System.out.println("Name:"+name+" age:"+age+" address:"+address);
		
	}
	public static void main(String[] args) {
		Person p=new Person();//OBJECT CREATION
		p.display();
	}
}

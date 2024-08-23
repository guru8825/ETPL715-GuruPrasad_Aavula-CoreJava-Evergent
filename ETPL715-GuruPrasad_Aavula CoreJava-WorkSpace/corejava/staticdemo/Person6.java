package com.evergent.corejava.staticdemo;

import java.util.Scanner;

public class Person6 {
static String name="Raju";//static variable
Scanner scanner=new Scanner(System.in);
int age=28;//non-static variable
String address="Hyderabad";
public void display() {
	name=scanner.nextLine();
	age=20;
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Address:"+address);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p1=new Person6();
		System.out.println(name);
		System.out.println(p1.age);
		p1.display();
		Person6 p2=new Person6();
		System.out.println(name);
		System.out.println(p2.age);
	//If we declare a variable as a static ,if modified the new value remains
		
		
		
		

	}

}

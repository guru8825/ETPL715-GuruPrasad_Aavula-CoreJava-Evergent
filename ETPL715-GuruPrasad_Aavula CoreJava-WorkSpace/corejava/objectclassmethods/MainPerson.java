package com.evergent.corejava.objectclassmethods;

public class MainPerson {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The Constructor initializes the final fields 
		when a person object is created*/
		PersonImmutable person=new PersonImmutable("Raju",22);
		
			System.out.println("Name :"+person.myName());
			System.out.println("Age :"+person.myAge());

	}
}

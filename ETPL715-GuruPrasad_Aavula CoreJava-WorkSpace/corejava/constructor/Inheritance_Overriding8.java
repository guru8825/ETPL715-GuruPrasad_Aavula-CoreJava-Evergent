package com.evergent.corejava.constructor;
class Animal{
	//Fields(Attributes)
	private String name;
	private int age;
	//Constructor
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//Method(Behaviour)
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
//Inheritance
class Dog extends Animal{
	private String breed;
	public Dog(String name, int age, String breed) {
		super(name,age);
		this.breed=breed;
	}
	//Method Overriding(Polymorphism)
	public void displayInfo() {
		super.displayInfo();
		//super used to call parent class method
		System.out.println("Breed: "+breed);
	}
}
public class Inheritance_Overriding8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("Buddy",5,"Golden Retriever");
		dog.displayInfo();
	}
}


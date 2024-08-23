package com.evergent.corejava.constructor;

	public class Student9 {
		String name;
		int age;
		//constructor
		public Student9(String name, int age) {
			this.name=name;
			this.age=age;
		}
		//Copy Constructor
		public Student9(Student9 s) {
			this.name=s.name;
			this.age=s.age;
		}
		//Method to display Student details
		public void displayDetails() {
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
		public static void main(String[] args) {
		
			Student9 student1=new Student9("ram", 200);//Creating an obj of student
			Student9 student2=new Student9(student1);//Creating a copy of Student1
			student1.displayDetails();
			student2.displayDetails();
		}
	}



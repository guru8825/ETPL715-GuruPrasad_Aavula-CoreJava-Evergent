  package com.evergent.corejava.collections.Task3;

import java.util.Scanner;



public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentImpl stu=new StudentImpl();
		for(;;){
			System.out.println("Select Your Choice:");
			System.out.println("1. Add New Student 2.Search Student by sId 3.To display All Students 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the Student Id :");
				  int sId=sc.nextInt();
				   System.out.println("Enter the Student Name :");
				   String sName=sc.next();
				   System.out.println("Enter the Student Address :");
				   String address=sc.next();
				   Student s1=new Student();
				   s1.setsId(sId);
				   s1.setsName(sName);
				   s1.setAddress(address);
				   String message=stu.addStudent(s1);
				   System.out.println("Student "+message+" Successfully Registered ");
				   break;
			case 2:System.out.println("Enter the Student Id number");
			   	   sId=sc.nextInt();
			   	System.out.println("Searching For the with Id "+sId);
			   	   stu.searchBySId(sId);
			   	   break;
			  			
			case 3:
				System.out.println("All The Student Registered Till Now :");
				stu.getAllStudents();
				break;
			case 4:
				System.out.println("Thank You");
				System.exit(0);
			}
			
		}

	}

}

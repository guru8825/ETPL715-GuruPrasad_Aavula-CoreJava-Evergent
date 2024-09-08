package com.evergent.corejava.StudentLayersApplication2;

import java.util.Scanner;
import java.util.ArrayList;


public class MainController {

	public static void main(String[] args) {
		int rollNo=0;
		String sName="";
		float marks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter The RollNo :");
		rollNo=sin.nextInt();
		System.out.println(("Enter The StudentName"));
		sName= sin.next();
		
		System.out.println("Enter The Marks Subject Wise Of Each 100 :");
		ArrayList<Integer> subjectWiseMarks=new ArrayList<>();
		
		System.out.println("Enter The Marks Of Computer Networks:");
		int computerNetworks=sin.nextInt();
		subjectWiseMarks.add(computerNetworks);
		
		System.out.println("Enter The Marks Of Computer Organization:");
		int computerOrganization=sin.nextInt();
		subjectWiseMarks.add(computerOrganization);
		
		System.out.println("Enter The Marks Of Fundamental Of Entrpreneurship");
		int fundamentalsOfEntreprenuer=sin.nextInt();
		subjectWiseMarks.add(fundamentalsOfEntreprenuer);
		
		System.out.println("Enter The Marks Of Web Technologies:");
		int webTechnologies=sin.nextInt();
		subjectWiseMarks.add(webTechnologies);
		
		for(int i:subjectWiseMarks) {
			marks=marks+i;
		}
		float averageMarks=(marks)/4;
		
		
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.studentServiceGrade(rollNo,sName,averageMarks);
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record ram Success");
	}

}

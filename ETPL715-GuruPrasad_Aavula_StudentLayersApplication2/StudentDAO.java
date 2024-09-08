package com.evergent.corejava.StudentLayersApplication2;

import java.util.ArrayList;

public class StudentDAO {
public int addStudent(StudentBean studentBean) {
	try{
		ArrayList studentList=new ArrayList();
		studentList.add(studentBean.getsName());
		studentList.add(studentBean.getRollNo());
		studentList.add(studentBean.getMarks());
		studentList.add(studentBean.getGrade());	
		
		System.out.println(studentList);
		
		System.out.println("Student Name :"+studentBean.getsName());
		System.out.println("Student Roll Number :"+studentBean.getRollNo());
		System.out.println("Student Marks :"+studentBean.getMarks());
		System.out.println("Student Grade:"+studentBean.getGrade());
		
		
		return 1;
	}
	catch(Exception e)
	{
		System.out.println(e);
		return 0;
	}
	
}
}

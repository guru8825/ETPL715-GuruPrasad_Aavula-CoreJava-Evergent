package com.evergent.corejava.StudentLayersApplication2;

public class StudentService {
	public int studentServiceGrade(int rollNo,String sName,float averageMarks)
	{  String grade="";
	
	   if(averageMarks<36)
	   {
		   grade = "F";
	   }
	   else if(averageMarks<=62)
	   {
		   grade = "B";
		   
	   }
	   else if(averageMarks<=80)
	   {
		   grade = "C";
		   
	   }
	   else
	   {
		   grade = "A";
	   }
	   
	   StudentDAO studentDAO=new StudentDAO();
	   StudentBean studentbean=new StudentBean();
	   studentbean.setRollNo(rollNo);
	   studentbean.setsName(sName);
	   studentbean.setMarks(averageMarks);
	   studentbean.setGrade(grade);
	   int updateresult=studentDAO.addStudent(studentbean);
	   return 1;
}
}
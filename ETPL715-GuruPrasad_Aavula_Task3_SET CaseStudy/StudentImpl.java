package com.evergent.corejava.collections.Task3;
import java.util.Set;



import java.util.HashSet;

public class StudentImpl implements StudentInterface{
Set<Student> studentSet=new HashSet<Student>();

	@Override
	public String addStudent(Student s) {
		studentSet.add(s);
		
		return s.getsName();
	}

	@Override
	public void searchBySId(int sId) {
		boolean b=false;
	if(studentSet.size()>0) {
		for(Student s:studentSet) {
			if(s.getsId()==(sId)) {
			System.out.println(s.getsId()+" "+s.getsName()+" "+s.getAddress());
			b=true;
			break;
		}
	}
	}
	if(!b) {
		System.out.print("The Student is not Registered");
	}
	}


	@Override
	public void getAllStudents() {
		if(studentSet.size()>0){
			for(Student s :studentSet){
				System.out.println(s.getsId()+" "+s.getsName()+" "+s.getAddress());
			}
				
		}else{
			System.out.println("No Student  is Registered");
		}
		
	}

}

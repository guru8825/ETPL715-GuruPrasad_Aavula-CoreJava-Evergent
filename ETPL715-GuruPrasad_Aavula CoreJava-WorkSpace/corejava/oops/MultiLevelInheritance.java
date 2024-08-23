package com.evergent.corejava.oops;

   class MyPerson {
	public void personInfo() {
		System.out.println("rajesh");
	}
}
 class PersonDetails extends MyPerson {
	public void personData() {
		System.out.println("Hyderabad");
	}
}
 //If to be there,there should be only public class which has main method
public class MultiLevelInheritance extends PersonDetails{
	public void show() {
		System.out.println("Local methods");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.personInfo();
		mi.personData();
		mi.show();

	}

}

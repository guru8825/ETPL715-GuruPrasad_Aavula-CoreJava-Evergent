package com.evergent.corejava.objectclassmethods;


	public class PersonImmutable{
		private final String name;
		private final int age;
		//constructor to initialize the fields
		/*The Constructor initializes the final fields 
		when a person object is created*/
		public PersonImmutable(String name,int age) {
			this.name=name;
			this.age=age;
		}
		public String myName() {
			return name;
		}
		public int myAge() {
			return age;
		}

}

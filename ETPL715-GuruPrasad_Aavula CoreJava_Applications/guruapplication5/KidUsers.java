package com.evergent.corejava.guruapplication5;

public class KidUsers implements LibraryUser {
	String bookType;
	int age;
	
	public KidUsers(int age,String bookType) {
		this.age=age;
		this.bookType=bookType;
	}



	public void registerAccount(int age) throws NotValidAge{
	if(age>12) {
		throw new NotValidAge("Sorry, Age must be less than 12 to register as a kid");
	}
	else {

		System.out.println("You have successfully registered under a Kids Account");
	}
		
	}


	public void registerBook(String bType) throws NotEligibleForThisBook  {
	if(bType.equals("Kids")) {
		System.out.println("Book Issued successfully, please return the book within 10 days");
	}
	else {
		throw new NotEligibleForThisBook ("Oops, you are allowed to take only kids books");
	}
		
	}

}

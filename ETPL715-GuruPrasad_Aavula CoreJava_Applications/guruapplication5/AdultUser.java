package com.evergent.corejava.guruapplication5;

public class AdultUser implements LibraryUser{
	int age;
	String bookType;
	
	

	public AdultUser(int age,String bookType) {
		this.age=age;
		this.bookType=bookType;
	}



	public void registerAccount(int age) throws NotValidAge{
	if(age<12) {
		throw new NotValidAge("Sorry, Age must be greater than 12 to register as an adult");
	}
	else {
		System.out.println("You have successfully registered under an Adult Account");
	}
		
	}


	public void registerBook(String bType) throws NotEligibleForThisBook  {
	if(bType.equals("Fiction")) {
		System.out.println("Book Issued successfully, please return the book within 7 days");
	}
	else {
		throw new NotEligibleForThisBook ("Oops, you are allowed to take only adult Fiction books");
	}
		
	}


}

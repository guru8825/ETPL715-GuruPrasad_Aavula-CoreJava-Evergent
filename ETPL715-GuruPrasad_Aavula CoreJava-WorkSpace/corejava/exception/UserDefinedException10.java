package com.evergent.corejava.exception;
class InvalidAgeException extends Exception{ 
	//message the deatail message.The detailed messaged is saved
	//for later retrived by getMessage();
	public InvalidAgeException(String message) {
		super(message);
}
}
public class UserDefinedException10 {
public static void checkAge(int age) throws InvalidAgeException{
	if(age<18) {
		throw new InvalidAgeException("Age must be 18 or older");
	}
	else {
		System.out.println("Access Granted :you are old enough");
	}
}
	public static void main(String[] args) {
		try {
			checkAge(16);
		}
		catch(InvalidAgeException e) {
			System.out.println("caught the Exception:"+e.getMessage());
			System.out.println(e);
	}
		System.out.println("Program continues afterv handling exception");
}
}

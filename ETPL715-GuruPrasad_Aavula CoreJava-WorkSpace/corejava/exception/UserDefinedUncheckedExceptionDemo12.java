package com.evergent.corejava.exception;
//Creating a userdefined runtime Exception by Extending RuntimeException
class InvalidScoreException extends RuntimeException{
	public InvalidScoreException (String message) {
		super(message);
	}
}
public class UserDefinedUncheckedExceptionDemo12 {
	public static void validateScore(int score) throws InvalidScoreException {
		if(score < 0 || score > 100)
			throw new InvalidScoreException("Score should be between 0 and 100...");
		else
			System.out.println("Score is valid...");
		}
		public static void main(String[] args) {
			try {
			validateScore(110);
			}
			catch(InvalidScoreException e) {
				System.out.println("Caught the exception : "+e.getMessage());
			}
			System.out.println("Program continuues after handling the exception..");
		}
	}
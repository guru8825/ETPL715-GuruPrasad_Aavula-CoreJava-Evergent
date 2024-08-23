package com.evergent.corejava.exception;
class InsufficientFundsException11 extends Exception{
	public InsufficientFundsException11 (String message) {
		/*super(message);
		 * Caught the exception : Insuffient Funds to withdraw...
Program continuues after handling the exception..*/
	}
}
public class UserDefinedExceptionFunds11 {
	public static void withdraw(double amount) throws InsufficientFundsException11 {
		double balance=500.00;
		if(amount > balance)
			throw new InsufficientFundsException11("Insuffient Funds to withdraw...");
		else
			System.out.println("Withdraw successfull...");
		}
		public static void main(String[] args) {
			try {
			withdraw(600.00);
			}
			catch(InsufficientFundsException11 e) {
				System.out.println("Caught the exception : "+e.getMessage());
			}
			System.out.println("Program continuues after handling the exception..");
		}
	}
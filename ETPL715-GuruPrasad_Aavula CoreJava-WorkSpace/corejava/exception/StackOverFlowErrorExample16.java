package com.evergent.corejava.exception;

public class StackOverFlowErrorExample16 {

	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverFlowError Caught"+e.getMessage());
		}

	}
public static void recursiveMethod() {
	recursiveMethod();
}
}

package com.evergent.corejava.exception;
//UnChecked Exception 
public class ArrayIndexOutOfException13 {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		try {
			System.out.println("Accessing element at index[10]: "+numbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught Exception: "+e.getMessage());
		}
	}
}
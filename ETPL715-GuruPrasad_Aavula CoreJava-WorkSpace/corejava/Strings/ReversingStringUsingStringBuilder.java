package com.evergent.corejava.Strings;

public class ReversingStringUsingStringBuilder {
	//reversing a String using StringBuilder

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		StringBuilder sb =new StringBuilder(str).reverse();
		System.out.print(sb.toString());

	}

}

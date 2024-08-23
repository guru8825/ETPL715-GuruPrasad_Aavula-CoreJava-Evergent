package com.evergent.corejava.Strings;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer("Hello");
		System.out.println("initial String :"+sb);
		//append at the end of the string
		sb.append("World");
		System.out.println("After Appending :"+sb);
		//to insert at particular location
		sb.insert(5,"Beautiful");
		System.out.println("After inserting :"+sb);
		//to replace a substring
		sb.replace(0, 5, "Hi");
		System.out.println("After repalcing :"+sb);
		//deleting a substring
		sb.delete(0, 2);
		System.out.println("After Deleting :"+sb);
		//reversing a string
		sb.reverse();
		System.out.println("reversed String:"+sb);
		//capacity an empty StringBuffer contains 16 character capacity. 
		//So when new characters are added the output is the length of characters+16 is returned.
		System.out.println("Capacity :"+sb.capacity());
		//gives length os string
		System.out.println("length :"+sb.length());
		

	}

}

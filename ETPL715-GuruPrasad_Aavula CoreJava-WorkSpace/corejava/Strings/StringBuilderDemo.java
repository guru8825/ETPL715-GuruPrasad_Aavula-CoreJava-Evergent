package com.evergent.corejava.Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder("Hello");
		System.out.println("initial String"+sb);
		sb.append("World!");
		System.out.println("After appending"+sb);
		sb.insert(5,"Beautiful");
		System.out.println("After inserting :"+sb);
		sb.replace(0, 5, "Hi");
		System.out.println("After repalcing :"+sb);
		sb.delete(0, 2);
		System.out.println("After Deleting :"+sb);
		sb.reverse();
		System.out.println("reversed String"+sb);
		
	}

}

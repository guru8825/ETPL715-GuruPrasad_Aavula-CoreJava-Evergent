package com.evergent.corejava.Strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a powerful  programming Language";
		String[] words=str.split(" ",0);
		for(String i:words) {
			System.out.println(i);
		}
		
	}

}

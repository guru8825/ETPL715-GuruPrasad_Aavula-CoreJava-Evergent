package com.evergent.corejava.Strings;

public class SplittDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a powerful programming Language";
		String[] words=str.split("a",-2);
		for(String s:words) {
			System.out.print(s);
		}
		

	}

}

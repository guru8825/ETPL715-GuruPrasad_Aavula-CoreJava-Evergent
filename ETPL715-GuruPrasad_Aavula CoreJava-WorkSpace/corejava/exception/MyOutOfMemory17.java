package com.evergent.corejava.exception;

public class MyOutOfMemory17 {

	public static void main(String[] args) {
		Integer[] a=new Integer[1000000000*10000000000];
		System.out.println(a);
	}
}

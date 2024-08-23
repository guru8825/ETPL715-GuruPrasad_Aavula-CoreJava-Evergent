package com.evergent.corejava.Logicalprogramming;

public class SwappingUsingXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=6;
		System.out.println("Before Swapping a="+a+",b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping a="+a+",b="+b);
		

	}

}

package com.evergent.corejava.Logicalprogramming;

public class SwappingUsingTemp {
	public static void main(String[] args) {
		int a=10,b=6,temp;
		System.out.println("Before Swapping a="+a+",b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a="+a+",b="+b);
	}

}

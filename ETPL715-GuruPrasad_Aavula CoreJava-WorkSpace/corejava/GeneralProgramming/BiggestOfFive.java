package com.evergent.corejava.GeneralProgramming;

public class BiggestOfFive {
	public static void main(String[] args) {
		int a=11,b=12,c=13,d=14,e=15;
		 int highest = a;

	        if (b > highest) {
	            highest =b;
	        }
	        if (c> highest) {
	            highest = c;
	        }
	        if (d > highest) {
	            highest =d;
	        }
	        if (e> highest) {
	            highest = e;
	        }

	        
	        System.out.println("The highest number is: " + highest);
	}
	}



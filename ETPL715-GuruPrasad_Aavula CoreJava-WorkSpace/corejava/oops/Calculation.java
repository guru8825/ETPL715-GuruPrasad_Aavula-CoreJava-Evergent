package com.evergent.corejava.oops;

public class Calculation {

	
		
		int a=10;
		int b=20;
		int c;
		public void addition() {
			
		c=a+b;
		System.out.print(c);

	}
		public static void main(String[] args) {
			Calculation cal=new Calculation();
			//reference referencevariable=objectcreation
			cal.addition();
		}

}

package com.evergent.corejava.Logicalprogramming;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		int n=10;
		 System.out.print("The First  " +n+" nubers in fibonacci series are "+n1+" " +n2);
		 for(int i=0;i<n;i++) {
			 n3=n1+n2;
			 System.out.print(" " +n3);
			
			 n1=n2;
			 n2=n3;
			 
		 }
			

	}

}

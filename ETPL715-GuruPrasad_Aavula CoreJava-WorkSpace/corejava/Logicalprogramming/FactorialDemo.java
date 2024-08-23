package com.evergent.corejava.Logicalprogramming;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int result=1;
		if(n==0) {
			System.out.print(result);
			return;
		}
		
		
		while(n>1) {
			result=result*n;
			n--;
			
		}
		System.out.print(result);
	}

}

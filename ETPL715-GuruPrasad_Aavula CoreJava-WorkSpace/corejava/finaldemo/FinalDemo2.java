package com.evergent.corejava.finaldemo;

 class Myclass {
	//Declaring a method as a final

	final public void myProducts() {
		System.out.print("All Products");
	}
 }
	public class FinalDemo2 extends Myclass{
		//Giving error while overriding myProducts as it is a final
		//Cannot override the final method from Myclass
		public void myProducts2() {
			System.out.print("All Products2");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 fd=new FinalDemo2();
		fd.myProducts2();
		
		Myclass mc=new Myclass();
		mc.myProducts();
		

	}
	}


package com.evergent.corejava.finaldemo;
final class Myclass1{
	public void myProducts() {
		System.out.println("My products");
	}
}

public class FinalDemo3 extends Myclass{
//unable to inherit Myclass as it is a final class
	//so to implement FinalDemo3 used Has-A relation
	public void myProducts2() {
		System.out.println("My products2");
	}
	public static void main(String[] args) {
		Myclass1 mc=new Myclass1();
		mc.myProducts();
		FinalDemo3 fd=new FinalDemo3();
		fd. myProducts2();
	}

}

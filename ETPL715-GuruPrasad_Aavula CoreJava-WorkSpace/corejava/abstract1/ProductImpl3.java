package com.evergent.corejava.abstract1;

public   class ProductImpl3 extends Product3 {
	//Constructor of Implementation class
	public ProductImpl3() {
		System.out.println("ProductImpl3:Constructor");
	}
	public void show() {
		System.out.println("Local Show Methods");
	}
	public void newProduct() {
		System.out.println("My New Product");
	}
public static void main(String[] args) {
		
ProductImpl3 product1=new ProductImpl3();
product1.show();
product1.newProduct();
product1.allProducts();
	}

	
}

package com.evergent.corejava.abstract1;
public class ProductImpl extends Product {
	
	public void show() {
		System.out.println("local show methods");
	}
public void newProduct() {
		System.out.println("My New Product");
		
	}
	
	public static void main(String[] args) {
		ProductImpl product1=new ProductImpl();
		//by using the Implementation class object accessing the abstract method and normalmethod of Product class
		product1.show();
		product1.newProduct();
		product1.allProducts();
		//Creating reference to Abstract class
		Product p1=new ProductImpl();
		p1.allProducts();
		p1.newProduct();
	}
}

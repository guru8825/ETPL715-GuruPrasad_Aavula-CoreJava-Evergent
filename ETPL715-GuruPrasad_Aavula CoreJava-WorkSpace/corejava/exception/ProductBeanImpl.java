package com.evergent.corejava.exception;

public class ProductBeanImpl {
	public static void main(String[] args) {
		//initializing values through constructor
		//And retrieving values through getter method
		ProductBean product=new ProductBean(100, "Laptop", 55000 );
		System.out.println("Product No: "+product.getPno());
		System.out.println("Product Name: "+product.getPname());
		System.out.println("Product Price: "+product.getPrice());
		
	}
}
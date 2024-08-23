package com.evergent.corejava.interfaces;

public class BookImps2 implements InterfaceBookDemo{

	
	public void bookTitle() {
		System.out.println("CoreJava");
		}
	public void bookAuthor() {
		System.out.println("Oracle corp");
	}
	public void bookPrice() {
		System.out.println("Rs 550");
	}
	public void show() {
	System.out.println("This is local method show");
	//cname="hi";
	//As the cname is final it cannot be reassigned
	
}
	public static void main(String[] args) {
		BookImps2 bm =new BookImps2();
		bm.bookTitle();
		bm.bookAuthor();
		bm.bookPrice();
		bm.show();
		
	InterfaceBookDemo bm1=new  BookImps2();
	//we can't  create object to interface,
	//but we can create reference to the interface
	bm1.bookTitle();
	bm1.bookAuthor();
	bm1.bookPrice();
	System.out.print(cname);/* As cname Can access directly because it is a static*/
	//bm1.show();
	/*we can't access the local methods with object reference of the interface*/
}
}

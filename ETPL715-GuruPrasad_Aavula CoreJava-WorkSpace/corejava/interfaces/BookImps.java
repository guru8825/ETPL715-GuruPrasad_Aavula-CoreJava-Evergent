package com.evergent.corejava.interfaces;

public class BookImps implements InterfaceBookDemo {
/*If any class implements interfaces 
	that class should be override all interface methods
	 otherwise that class will be shown with compile time error*/
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
		System.out.println("This is a local method");
		
	}
	public static  void  main (String[] args) {
		BookImps bm=new  BookImps();
		bm.bookTitle();
		bm.bookAuthor();
		bm.bookPrice();
		bm.show();
		InterfaceBookDemo bm1=new BookImps();
		//we can't create object to interface,
		//but we can create reference to interface
		bm1.bookTitle();
		bm1.bookAuthor();
		bm1.bookPrice();
		//bm1.show();
//		we can't access the local methods with the objecr reference of the interface
	}
}

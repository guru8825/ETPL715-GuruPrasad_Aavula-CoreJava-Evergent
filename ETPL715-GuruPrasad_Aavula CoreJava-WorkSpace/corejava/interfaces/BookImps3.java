package com.evergent.corejava.interfaces;
//Here the class BookImps implements two Interfaces which is called as Multiple Inheritance
/*multiple inheritance is not supported in the case of class because of ambiguity.
 *  However, it is supported in case of an interface because there is no ambiguity. 
 *  It is because its implementation is provided by the implementation class.*/ 
public class BookImps3 implements InterfaceBookDemo,NewBook{

	

	public void MyData() {
		
		System.out.println("My Data Interface");
	}
	
public void bookTitle() {
		
	System.out.println("CoreJava");
	}
public void bookAuthor() {
		System.out.println("Oracle corp");
	}
public void addNewBook() {
		
	System.out.println("Java new version");
	}
//bookPrice() method declared in both interfaces but there is only one implementation
//so,there is no ambuiguity
public void bookPrice() {
		System.out.println("Rs 550");
	}
public static void main(String[] args) {
	BookImps3 b3=new BookImps3();
	b3.bookTitle();
	b3.bookPrice();
	b3.bookAuthor();
	b3.addNewBook();
	b3.MyData();

}
}

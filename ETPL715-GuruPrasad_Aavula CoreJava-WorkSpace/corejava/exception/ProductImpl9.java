package com.evergent.corejava.exception;

//UserDefined Exception
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String msg) {
		System.out.println("hello"+msg);
	}
}
public class ProductImpl9{
int pno=105;
public void myData()  throws ProductNotFoundException{
	if(pno>100) {
		throw new ProductNotFoundException("This Product is not there");
	}
	else {System.out.println("Product is Available");}
}
	public static void main(String[] args) {
		
try {
	ProductImpl9 p9=new ProductImpl9();
	p9.myData();
	//In abnormal cases below lines are unreachable
	System.out.println("Welcome");
}
catch(Exception e) {
	//in normal case this block is unreachable
	System.out.println("I can Handle..");
}
//the below lines are always reachable
System.out.print("The End");
	}

}

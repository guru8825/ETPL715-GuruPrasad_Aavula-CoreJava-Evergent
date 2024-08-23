package com.evergent.corejava.interfaces;

public interface InterfaceBookDemo {
	//by default all data members in interface are static and final
	//Interfaces is keyword
	//We can declare methods signature only not implementation
	//By Default all interface methods are abstract
	String cname="India";
	abstract	public void bookTitle();
				public void bookAuthor();
				public void bookPrice();
}

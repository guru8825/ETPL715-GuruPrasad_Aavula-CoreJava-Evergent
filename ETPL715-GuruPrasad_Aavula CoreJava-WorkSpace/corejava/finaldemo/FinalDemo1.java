package com.evergent.corejava.finaldemo;

public class FinalDemo1 {
	final String cname="India";
	/*a)final is a keyword
	b)We can declare final as variables,methods,classes
	c)final variables we can’t modify (reassign the value*/

	public void myData() {
		//cname ="Welcome"
				//The final declared variable cannot be reassigned
		System.out.print(cname);
		

	}
	public static void main(String[]args) {
		FinalDemo1 fd =new FinalDemo1();
		fd.myData();
			
	}
}

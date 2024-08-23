package com.evergent.corejava.oops;

public class MethodFlow {
	//WITHOUT RETURN TYPE WITHOUT PARAMETERS
	public void show() {
		System.out.println("No parameters No Return Value");
	}
	//WITH PARAMETERS wITHOUT RETURN TYPE
	public void myData(int a,int b) {
		System.out.println(a+b);	
	}
	//WITH RETURN TYPE WITH PARAMETERS
public int myMul(int a,int b) {
	return a*b;
	}
//WITH RETURN TYPE WITHOUT PARAMETERS
public int myChange() {
	return 100;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow mf=new MethodFlow();
		mf.show();
		mf.myData(10,20);
		System.out.println(mf.myMul(10, 20));
		System.out.println(mf.myChange());
	}

}

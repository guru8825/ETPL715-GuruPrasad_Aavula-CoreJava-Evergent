package com.evergent.corejava.oops;

public class UserLogin {
	//If a class has multiple methods having same name
	//but different in parameters, it is known as Method Overloading.
	public void loginDetails() {
		System.out.println("login Details");
	}
	
	public void loginDetails(String uname,String pass) {
		System.out.println("Username:"+uname);
		System.out.println("Password:"+pass);
		}
	
	public void loginDetails(String uname,String pass,String captcha) {
		System.out.println("username:"+uname);
		System.out.println("Password:"+pass);
		System.out.println("captcha:"+captcha);
		}
	
	public void loginDetails(int mobile,String pass) {
		System.out.println("Mobile:"+pass);
		System.out.println("Password:"+pass);
		}
	
	public void show() {
		System.out.print("Normal method");
	}

	public static void main(String[] args) {
		UserLogin ulogin=new UserLogin();
		ulogin.loginDetails();
		ulogin.loginDetails("Raj","raj123");
		ulogin.loginDetails("Ravi","Ravi123","abc");
		ulogin.loginDetails(1111,"abc");
		ulogin.show();

	}
}

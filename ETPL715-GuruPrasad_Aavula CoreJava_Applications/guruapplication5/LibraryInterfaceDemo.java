package com.evergent.corejava.guruapplication5;
import java.util.*;

public class LibraryInterfaceDemo {
	static Scanner sc=new Scanner(System.in);
	static String userName="Guru";
	public static void main(String[] args) {
		System.out.println("Enter User Name:");
		String userNameInput=sc.nextLine();
		if(!userNameInput.equals(userName)) {
			System.out.print("UserName Not Matched");
			System.exit(0);
		}
		System.out.println("The Available options to Register are : ");
		System.out.println("1 -KidUser");
		System.out.println("2 -AdultUser");
		
		System.out.println("Enter Your Choice (1 or 2) :");
		int choice=sc.nextInt(); 
		if(choice==1) {
		System.out.println("You have Choosen to Register as KidUSer ");
		}
		else {
			System.out.println("You have Choosen to Register as AdultUSer ");
		}
		System.out.println("Enter You Age : ");
		int age=sc.nextInt();
		
		
		sc.nextLine();
		
		System.out.println("Enter The Book Category You Want Choose(Kids,Fiction) : ");
		String bType= sc.nextLine();
		
		try {
		switch(choice) {
		case 1:
			KidUsers ku=new KidUsers(age,bType);
			ku.registerAccount(age);
			ku.registerBook(bType);
			break;
		case 2:
			AdultUser au=new AdultUser(age,bType);
			au.registerAccount(age);
			au.registerBook(bType);
			break;
		default:
			System.out.print("Invalid Choice");
			break;
			}
		}
		catch(Exception e) {
				System.out.print(e.getMessage());
			}
	}
}

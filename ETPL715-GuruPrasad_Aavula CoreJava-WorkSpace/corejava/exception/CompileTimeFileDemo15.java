package com.evergent.corejava.exception;
import java.io.File;
//Checked Exception
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CompileTimeFileDemo15 {
	public static void main(String[] args) {
		try {
			File file=new File("C:/MyData/sample.txt");
			
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}

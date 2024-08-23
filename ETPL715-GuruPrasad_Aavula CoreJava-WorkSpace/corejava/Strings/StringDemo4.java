package com.evergent.corejava.Strings;

public class StringDemo4 {
//CONTAINS CHECKS FOR THE gIVEN SUBSTRING EXIST IN STRING OR NOT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		String substr="fox";
		boolean contains=str.contains(substr);
		
       
        
        System.out.println("Contains "+substr+":"+contains);
	}

}

package com.evergent.corejava.Strings;
import java.util.*;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b;
		System.out.println('a'+'b');
		System.out.println('a'+3);
		System.out.println((char)('a'+3));
		System.out.println("a"+"b");
		
		
		String series="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series=series+ch;
			}
		System.out.println(series);
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			sb.append(ch);
		}
		System.out.println(sb);
		
		
		
		String name="JAVATECHNOLOGIES";
		System.out.println(Arrays.toString(name.toCharArray()));
		
		
		
		System.out.println(name.indexOf('T'));
		System.out.println("JAVA  ".strip());
	}
}

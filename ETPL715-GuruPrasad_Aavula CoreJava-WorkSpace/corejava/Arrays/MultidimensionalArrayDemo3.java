package com.evergent.corejava.Arrays;

public class MultidimensionalArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=7;
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i+j==4 ||i==j) {
				System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		

	}

}

package com.java.miscellanoeus;

public class ArraysManips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int rows = a.length;
		int columns = a[0].length;
		int n = rows * columns;
//		int arr[n] = {};
		printArray(a, a.length, a[0].length);
		transposeArray(a);
	}

	public static void transposeArray(int [][]a){
		int rows = a.length;
		int columns = a[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(i == j)
					continue;
				
				int temp = a[j][i];
				a[j][i] = a[i][j];
				a[i][j] = temp;
			}
		}
		
	}
	
	public static void printArray(int a[][],int row,int column){
		for(int i = 0; i < row;i++){
			for(int j = 0; j < column; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	
	
}

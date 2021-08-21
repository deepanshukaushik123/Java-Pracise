package com.arrays;

public class Array2D {

	public static void main(String[] args) {
		// way-1 2D array
	//	int [][]arr=new int[ROW][COLUMN]; 
		int [][] arr=new int[3][2]; //3x2=6
		arr[0][0]=10;
		arr[0][1]=11;
		arr[1][0]=12;
		arr[1][1]=13;
		arr[2][0]=14;
		arr[2][1]=15;
		
//		System.out.println(arr.length);
		
		for (int i=0; i<arr.length; i++) { //rows
				for(int j=0; j<arr[i].length; j++ ) //columns
				{
					System.out.print(arr[i][j]+" ");
				}
			
			System.out.println();
		}
		
		//Easiest way to get value from array
		for (int [] array:arr) {
			for (int a:array) {
				System.out.print(a +" ");
			}
			System.out.println();
		}
		
		//Way-2 2D array
//		int [] arr2[] = {
//				{10, 2, 9},
//				{5, 4, 6, 6},
//				{9, 4, 3,2 ,6}
//		}; //3x3=9
//		System.out.println(arr2.length);  //This will print no. of Rows
//		System.out.println(arr2[0].length); //This will print no. of column in 0th Row
//		System.out.println(arr2[1].length); //This will print no. of column in 1st Row
//		System.out.println(arr2[2].length); //This will print no. of column in 2nd Row
//		
	}

}

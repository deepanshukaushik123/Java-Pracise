package com.arrays;

public class Array1D {

	public static void main(String[] args) {
		// WAY-1 OF DECLARING ARRAY
		int []arr=new int[5];	//5 is length of array
		arr[0]=5;
		arr[1]=10;
		arr[2]=20;
		arr[3]=30;
		arr[4]=40;
		
		// WAY-2 OF DECLARING ARRAY
		int []arr2= {5, 10, 15, 11, 55, 13};
		
	
		int c=arr2[1]+arr[3];
//		System.out.println(arr.length);
//		System.out.println(arr2.length);
//		System.out.println(c);
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			
		}
	}

}
